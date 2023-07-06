package com.example.membership.adapter.`in`.web

import com.example.membership.application.port.`in`.RegisterMembershipCommand
import com.example.membership.application.port.`in`.RegisterMembershipUseCase
import com.example.membership.domain.Membership
import common.WebAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterMembershipController(
    private val registerMembershipUseCase: RegisterMembershipUseCase,
) {

    @PostMapping("/register")
    fun registerMembership(@RequestBody request: RegisterMembershipRequest): Membership {
        return RegisterMembershipCommand(
            name = request.name,
            email = request.email,
            address = request.address,
            isValid = true,
            isCorp = request.isCorp,
        ).let(registerMembershipUseCase::registerMembership)
    }
}
