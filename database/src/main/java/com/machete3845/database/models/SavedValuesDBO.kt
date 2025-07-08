package com.machete3845.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "addressResults")
data class SavedValuesDBO (
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
     @ColumnInfo("param1") val param1: String,
     @ColumnInfo("param2") val param2: String,
     @ColumnInfo("int") val int: Int,
)
