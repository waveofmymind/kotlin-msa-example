package com.example.membership.adapter.`in`.web

import com.example.membership.application.port.`in`.FindMembershipCommand
import com.example.membership.application.port.`in`.FindMembershipUseCase
import com.example.membership.domain.Membership
import common.WebAdapter
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
class FindMembershipController(
    private val findMembershipUseCase: FindMembershipUseCase,
) {
    @GetMapping("/membership/{membershipId}")
    fun findMembershipByMembershipId(@PathVariable membershipId: String): ResponseEntity<Membership> {
        return ResponseEntity.ok(
            findMembershipUseCase.findMembership(
                FindMembershipCommand(
                    membershipId = membershipId
                )
            )
        )
    }
}
