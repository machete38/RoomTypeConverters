package com.machete3845.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.machete3845.database.fts.NoteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NoteEntity): Long

    @Query("SELECT * FROM notes")
    fun getAllNotes(): Flow<List<NoteEntity>>

    @Query("""
        SELECT notes.* FROM notes
        JOIN notesFts ON notes.id = notesFts.rowid
        WHERE notesFts MATCH :query
    """)
    fun searchNotes(query: String): Flow<List<NoteEntity>>

    @Query("""
        SELECT notes.* FROM notes 
        JOIN notesFts ON notes.id = notesFts.rowid
        WHERE notesFts MATCH :query
    """)
    suspend fun searchNotesSync(query: String): List<NoteEntity>
}
