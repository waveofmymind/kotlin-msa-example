package com.example.membership.application.service

import com.example.membership.adapter.out.persistence.MembershipMapper
import com.example.membership.application.port.`in`.FindMembershipCommand
import com.example.membership.application.port.`in`.FindMembershipUseCase
import com.example.membership.application.port.out.FindMembershipPort
import com.example.membership.domain.Membership
import common.UseCase
import org.springframework.transaction.annotation.Transactional

@UseCase
@Transactional
class FindMembershipService(
    private val findMembershipPort: FindMembershipPort,
    private val membershipMapper: MembershipMapper,
) : FindMembershipUseCase  {

    override fun findMembership(command: FindMembershipCommand): Membership {
        membershipMapper.
        mapToDomainEntity(findMembershipPort.
        findMembership(Membership.Companion.MembershipId(command.membershipId)))
            .let { return it }
    }
}
