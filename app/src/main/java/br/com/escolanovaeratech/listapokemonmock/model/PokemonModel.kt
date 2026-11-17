package br.com.escolanovaeratech.listapokemonmock.model

import androidx.annotation.DrawableRes

data class PokemonModel(
    val id: Int,
    val name: String,
    @param:DrawableRes val imageRes: Int,
    val types: List<PokemonType>,
    val heightMeters: Double,
    val description: String,
    val weightKg: Double,
    val hp: Int,
    val attack: Int,
    val defense: Int,
    val specialAttack: Int,
    val specialDefense: Int,
    val speed: Int
) {
    val type: List<PokemonType> get() = types
}
