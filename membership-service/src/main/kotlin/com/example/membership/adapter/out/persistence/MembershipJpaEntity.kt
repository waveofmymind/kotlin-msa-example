package com.example.membership.adapter.out.persistence

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "membership")
data class MembershipJpaEntity(

    val name: String,

    val email: String,

    val address: String,

    val isValid: Boolean,

    val isCorp: Boolean,

    @Id
    @GeneratedValue val membershipId: Long = 0L,
)
