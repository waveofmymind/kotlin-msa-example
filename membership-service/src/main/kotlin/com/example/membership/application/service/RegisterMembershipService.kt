package com.example.membership.application.service

import com.example.membership.adapter.out.persistence.MembershipMapper
import com.example.membership.application.port.`in`.RegisterMembershipCommand
import com.example.membership.application.port.`in`.RegisterMembershipUseCase
import com.example.membership.application.port.out.RegisterMembershipPort
import com.example.membership.domain.Membership
import common.UseCase
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class RegisterMembershipService(
    private val registerMembershipPort: RegisterMembershipPort,
    private val membershipMapper: MembershipMapper,
): RegisterMembershipUseCase {

    override fun registerMembership(command: RegisterMembershipCommand): Membership {

        val jpaEntity = registerMembershipPort.createMembership(
            Membership.Companion.MembershipName(command.name),
            Membership.Companion.MembershipEmail(command.email),
            Membership.Companion.MembershipAddress(command.address),
            Membership.Companion.MembershipIsValid(command.isValid),
            Membership.Companion.MembershipIsCorp(command.isCorp),
        )

        // entity -> Membership
        membershipMapper.mapToDomainEntity(jpaEntity).let {
            return it
        }
    }
}