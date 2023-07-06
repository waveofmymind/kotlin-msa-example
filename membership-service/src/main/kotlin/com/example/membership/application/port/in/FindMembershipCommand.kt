package com.example.membership.application.port.`in`

import common.SelfValidating

data class FindMembershipCommand(
    val membershipId: String

) : SelfValidating<FindMembershipCommand>()
