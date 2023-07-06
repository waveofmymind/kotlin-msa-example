package com.example.membership.adapter.out.persistence

import jakarta.annotation.Generated
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "membership")
data class MembershipJpaEntity(

    private val name: String,

    private val email: String,

    private val address: String,

    private val isValid: Boolean,

    private val isCorp: Boolean,

    @Id
    @Generated
    private val membershipId: Long = 0L,
)
