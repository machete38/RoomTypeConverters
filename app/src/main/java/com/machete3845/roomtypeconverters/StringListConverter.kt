//package com.machete3845.roomtypeconverters
//
//import androidx.room.TypeConverter
//import java.lang.reflect.Type
//
//object StringListConverter {
//    @TypeConverter
//    fun fromString(value: String?): List<String> {
//        if (value == null) {
//            return emptyList()
//        }
//        val listType: Type = object : TypeToken<List<String>>() {}.type
//        return Gson().fromJson(value, listType)
//    }
//
//    @TypeConverter
//    fun fromList(list: List<String>?): String? {
//        return list?.let {
//            Gson().toJson(it)
//        }
//    }
//}
