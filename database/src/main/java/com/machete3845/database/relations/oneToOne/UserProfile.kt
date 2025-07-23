package com.machete3845.database.relations.oneToOne

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserProfile(
    @PrimaryKey val profileId: Long,
    val bio: String,
    val avatarUrl: String,
    @ColumnInfo(index = true)
    val userId: Long
)
