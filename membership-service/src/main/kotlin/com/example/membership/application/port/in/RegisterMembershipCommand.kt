package com.example.membership.application.port.`in`

import common.SelfValidating
import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.NotNull

data class RegisterMembershipCommand(

    @NotNull
    val name: String,
    @NotNull
    val email: String,
    @NotNull
    val address: String,
    @AssertTrue
    val isValid: Boolean,

    val isCorp: Boolean,
) : SelfValidating<RegisterMembershipCommand>() {

    init {
        validateSelf()
    }
}
