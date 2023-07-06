package com.example.membership.domain

class Membership(
    private val membershipId: String,

    private val name: String,

    private val email: String,

    private val address: String,

    private val isValid: Boolean,

    private val isCorp: Boolean,
) {
    companion object {

        fun generateMember(
            membershipId: MembershipId,
            membershipName: MembershipName,
            membershipEmail: MembershipEmail,
            membershipAddress: MembershipAddress,
            membershipIsValid: MembershipIsValid,
            membershipIsCorp: MembershipIsCorp
        ): Membership {
            return Membership(
                membershipId = membershipId.membershipId,
                name = membershipName.nameValue,
                email = membershipEmail.membershipEmail,
                address = membershipAddress.addressValue,
                isValid = membershipIsValid.isValidValue,
                isCorp = membershipIsCorp.isCorpValue
            )
        }

        class MembershipId(
            val membershipId: String
        )

        class MembershipName(
            val nameValue: String
        )

        class MembershipEmail(
            val membershipEmail: String
        )

        class MembershipAddress(
            val addressValue: String
        )

        class MembershipIsValid(
            val isValidValue: Boolean
        )

        class MembershipIsCorp(
            val isCorpValue: Boolean
        )
    }
}
