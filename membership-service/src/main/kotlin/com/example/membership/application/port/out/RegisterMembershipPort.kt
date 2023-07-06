package com.example.membership.application.port.out

import com.example.membership.adapter.out.persistence.MembershipJpaEntity
import com.example.membership.domain.Membership

interface RegisterMembershipPort {

    fun createMembership(
        membershipName: Membership.Companion.MembershipName,
        membershipEmail: Membership.Companion.MembershipEmail,
        membershipAddress: Membership.Companion.MembershipAddress,
        membershipIsValid: Membership.Companion.MembershipIsValid,
        membershipIsCorp: Membership.Companion.MembershipIsCorp,
    ) : MembershipJpaEntity
}
