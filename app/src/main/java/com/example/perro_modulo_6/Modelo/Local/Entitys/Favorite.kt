package com.example.perro_modulo_6.Modelo.Local.Entitys

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName ="Favorite")
data class Favorite (

    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val breed: String ,
    val imageUrl : String
)