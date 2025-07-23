package com.machete3845.database.relations.oneToOne

import androidx.room.Embedded
import androidx.room.Relation


data class UserWithProfile(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userId",
        entityColumn = "userId"
    )
    val profile: UserProfile
)
