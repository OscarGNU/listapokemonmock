package br.com.escolanovaeratech.listapokemonmock.data

import br.com.escolanovaeratech.listapokemonmock.R
import br.com.escolanovaeratech.listapokemonmock.model.PokemonModel

object PokemonMock {

    val pokemon : List<PokemonModel> = listOf(

        PokemonModel(
            1,
            "Bulbasaur",
            R.drawable.bulbasaur),
        PokemonModel(
            2,
            "Charmander",
            R.drawable.charmander),
        PokemonModel(3,
            "Squirtle",
            R.drawable.squirtle),
        PokemonModel(4,
            "Pikachu",
            R.drawable.pikachu),
        PokemonModel(5,
            "Meowth",
            R.drawable.meowth),
        PokemonModel(id = 6,
            name = "Psyduck",
            imageRes = R.drawable.psyduck),
        PokemonModel(id = 7,
            name = "Gengar",
            imageRes = R.drawable.gengar),
        PokemonModel(id = 8,
            name = "Eevee",
            imageRes = R.drawable.eevee),
        PokemonModel(id = 9,
            name = "Snorlax",
            imageRes = R.drawable.snorlax)
    )
}