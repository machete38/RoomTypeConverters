package com.machete3845.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.machete3845.database.models.SavedValuesDBO

@Dao
interface SavedValuesDao {

    @Query("SELECT * FROM savedValues")
    fun getAllValues(): List<SavedValuesDBO>

    @Insert
    suspend fun insertValue(elements: List<SavedValuesDBO>)

    @Update
    suspend fun updateValue(elements: List<SavedValuesDBO>)

    @Delete
    suspend fun remove(elements: List<SavedValuesDBO>)

    @Query("DELETE FROM savedValues")
    suspend fun clear()
}
