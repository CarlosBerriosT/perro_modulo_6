package com.example.perro_modulo_6.Modelo.Local.Entitys

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName ="Breed_images")
data class BreedImages (

    @PrimaryKey (autoGenerate = true)val id : Long =0,
    val imageUrls : String // Cadena de URLs separadas por comas
)