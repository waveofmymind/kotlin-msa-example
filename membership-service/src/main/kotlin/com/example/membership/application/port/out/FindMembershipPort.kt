package com.example.membership.application.port.out

import com.example.membership.adapter.out.persistence.MembershipJpaEntity
import com.example.membership.domain.Membership

interface FindMembershipPort {

    fun findMembership(
        membershipId: Membership.Companion.MembershipId,
    ): MembershipJpaEntity
}
