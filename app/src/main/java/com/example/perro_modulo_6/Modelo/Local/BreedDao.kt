package com.example.perro_modulo_6.Modelo.Local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.perro_modulo_6.Modelo.Local.Entitys.Breed
import com.example.perro_modulo_6.Modelo.Local.Entitys.BreedImages
import com.example.perro_modulo_6.Modelo.Local.Entitys.Favorite

@Dao
interface BreedDao {

    // Insertar una raza o el listado de razas
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(breed: List<Breed>)

    // Obtener todas las razas
    @Query("SELECT * FROM Breed")
    suspend fun getAllBreeds(): List<Breed>

    // Insertar múltiples imágenes de razas
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllImages(breedImages: List<BreedImages>)

    // Obtener todas las imágenes
    @Query("SELECT * FROM Breed_images")
    suspend fun getAllBreedsImage(): List<BreedImages>

    // Insertar un favorito
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(favorite: Favorite)

    // Obtener todos los favoritos
    @Query("SELECT * FROM Favorite")
    suspend fun getAlLFavorite(): List<Favorite>
}
