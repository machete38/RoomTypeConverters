package com.machete3845.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.machete3845.database.models.SavedValuesDBO

@Database(entities = [SavedValuesDBO::class], version = 1)
@TypeConverters(DateConverter::class)
internal abstract class RoomDB : RoomDatabase(){

}
