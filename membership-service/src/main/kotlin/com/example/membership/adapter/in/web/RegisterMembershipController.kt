package com.example.membership.adapter.`in`.web

import common.WebAdapter
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class RegisterMembershipController {

    @PostMapping("/register")
    fun registerMembership(@RequestBody request: RegisterMembershipRequest) {
        // request ~~

        // UseCase
    }
}
