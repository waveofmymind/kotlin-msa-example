package com.example.membership.application.port.`in`

import com.example.membership.domain.Membership
import common.UseCase

interface RegisterMembershipUseCase {
    fun registerMembership(request: RegisterMembershipCommand) : Membership
}
