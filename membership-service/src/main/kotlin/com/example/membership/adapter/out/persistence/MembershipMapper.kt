package com.example.membership.adapter.out.persistence

import com.example.membership.domain.Membership
import org.springframework.stereotype.Component

@Component
class MembershipMapper {

    fun mapToDomainEntity(membershipJpaEntity: MembershipJpaEntity): Membership {
        return Membership.generateMember(
            Membership.Companion.MembershipId(membershipJpaEntity.membershipId.toString()),
            Membership.Companion.MembershipName(membershipJpaEntity.name),
            Membership.Companion.MembershipEmail(membershipJpaEntity.email),
            Membership.Companion.MembershipAddress(membershipJpaEntity.address),
            Membership.Companion.MembershipIsValid(membershipJpaEntity.isValid),
            Membership.Companion.MembershipIsCorp(membershipJpaEntity.isCorp),
        )
    }
}
