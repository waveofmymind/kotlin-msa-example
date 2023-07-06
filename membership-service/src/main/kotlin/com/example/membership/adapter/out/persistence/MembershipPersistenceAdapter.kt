package com.example.membership.adapter.out.persistence

import com.example.membership.application.port.out.FindMembershipPort
import com.example.membership.application.port.out.RegisterMembershipPort
import com.example.membership.domain.Membership
import common.PersistenceAdapter
import jakarta.persistence.EntityNotFoundException
import org.springframework.data.repository.findByIdOrNull

@PersistenceAdapter
class MembershipPersistenceAdapter(
    private val membershipRepository: SpringDataMembershipRepository
) : RegisterMembershipPort, FindMembershipPort {

    override fun createMembership(
        membershipName: Membership.Companion.MembershipName,
        membershipEmail: Membership.Companion.MembershipEmail,
        membershipAddress: Membership.Companion.MembershipAddress,
        membershipIsValid: Membership.Companion.MembershipIsValid,
        membershipIsCorp: Membership.Companion.MembershipIsCorp
    ): MembershipJpaEntity {
        return membershipRepository.save(
            MembershipJpaEntity(
                name = membershipName.nameValue,
                email = membershipEmail.membershipEmail,
                address = membershipAddress.addressValue,
                isValid = membershipIsValid.isValidValue,
                isCorp = membershipIsCorp.isCorpValue,
            )
        )
    }

    override fun findMembership(membershipId: Membership.Companion.MembershipId): MembershipJpaEntity {
        return membershipRepository.findByIdOrNull(membershipId.membershipId.toLong()) ?: throw EntityNotFoundException("잘못된 요청입니다.")
    }
}
