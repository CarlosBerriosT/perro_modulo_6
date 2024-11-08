package com.example.perro_modulo_6.Modelo.Local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.perro_modulo_6.Modelo.Local.Entitys.Breed
import com.example.perro_modulo_6.Modelo.Local.Entitys.BreedImages
import com.example.perro_modulo_6.Modelo.Local.Entitys.Favorite

@Database(entities =[Breed::class, BreedImages::class, Favorite::class],version=1)
abstract class BreedDatabase :RoomDatabase() {



    // REFERENCIA AL DAO PARTE LOCAL
    abstract fun breeDao(): BreedDao

    companion object {
        @Volatile
        private var INSTANCE: BreedDatabase? = null

        fun getDataBase(context: Context): BreedDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BreedDatabase::class.java,
                    "breeds_database"
                )
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}