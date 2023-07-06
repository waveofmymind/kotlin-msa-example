package com.example.membership.application.port.`in`

import com.example.membership.domain.Membership

interface FindMembershipUseCase {

    fun findMembership(command: FindMembershipCommand): Membership
}
