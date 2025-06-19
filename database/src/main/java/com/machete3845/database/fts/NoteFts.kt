package com.machete3845.database.fts

import androidx.room.Entity
import androidx.room.Fts4

@Fts4(contentEntity = NoteEntity::class)
@Entity(tableName = "notesFts")
data class NoteFts(
    val title: String,
    val content: String,
)
