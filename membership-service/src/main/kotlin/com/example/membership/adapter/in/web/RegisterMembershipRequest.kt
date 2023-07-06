package com.example.membership.adapter.`in`.web

data class RegisterMembershipRequest(
    val name: String,
    val email: String,
    val address: String,
    val isCorp: Boolean,
)
