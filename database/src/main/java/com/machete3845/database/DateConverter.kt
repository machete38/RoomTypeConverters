package com.machete3845.database

import androidx.room.TypeConverter
import java.util.Date

object DateConverter {
@TypeConverter
fun fromTimestamp(value: Long?): Date?{
    return if (value == null) null else Date(value)
}
    @TypeConverter
    fun dateToTimestamp(value: Date?): Long?{
        return value?.time
    }
}
