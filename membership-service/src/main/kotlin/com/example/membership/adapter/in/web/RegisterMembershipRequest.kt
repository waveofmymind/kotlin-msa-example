package com.example.membership.adapter.`in`.web

data class RegisterMembershipRequest(
    private val name: String,
    private val email: String,
    private val address: String,
    private val isCorp: Boolean,
)
