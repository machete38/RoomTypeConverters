package com.machete3845.database.relations.oneToOne

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val userId: Long,
    val name: String,
    val email: String,
)

