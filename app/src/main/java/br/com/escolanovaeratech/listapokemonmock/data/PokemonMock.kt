package br.com.escolanovaeratech.listapokemonmock.data

import br.com.escolanovaeratech.listapokemonmock.R
import br.com.escolanovaeratech.listapokemonmock.model.PokemonModel
import br.com.escolanovaeratech.listapokemonmock.model.PokemonType

object PokemonMock {

    val pokemon : List<PokemonModel> = listOf(

        PokemonModel(
            1,
            "Bulbasaur",
            imageRes =  R.drawable.bulbasaur,
            types = listOf(PokemonType.GRAMA, PokemonType.VENEN0),
            heightMeters = 0.7,
            description = "Há uma semente de planta nas costas deste Pokémon desde o nascimento. A semente cresce lentamente.",
            weightKg = 6.9,
            hp = 45,
            attack = 49,
            defense = 49,
            specialAttack = 65,
            specialDefense = 65,
            speed = 45,
            ),
        PokemonModel(
            2,
            name = "Charmander",
            imageRes = R.drawable.charmander,
            types = listOf(PokemonType.FOGO),
            description = "Prefere lugares quentes. Quando chove, dizem que sai vapor da ponta de sua cauda.",
            heightMeters = 0.6,
            weightKg = 8.5,
            hp = 39,
            attack = 52,
            defense = 43,
            specialAttack = 60,
            specialDefense = 50,
            speed = 65
        ),
        PokemonModel(
            3,
            "Squirtle",
            types = listOf(PokemonType.AGUA),
           imageRes =  R.drawable.squirtle,
            description = "Após o nascimento, suas costas incham e endurecem, formando um casco. Dispara espuma pela boca.",
            heightMeters = 0.5,
            weightKg = 9.0,
            hp = 44,
            attack = 48,
            defense = 65,
            specialAttack = 50,
            specialDefense = 64,
            speed = 43
        ),
        PokemonModel(
            4,
            "Pikachu",
            R.drawable.pikachu,
            types = listOf(PokemonType.ELETRICO),
            description = "Pikachu armazena eletricidade em suas bochechas. Quando se sente ameaçado, libera poderosas descargas elétricas.",
            heightMeters = 0.4,
            weightKg = 6.0,
            hp = 35,
            attack = 55,
            defense = 40,
            specialAttack = 50,
            specialDefense = 50,
            speed = 90
        ),
        PokemonModel(
            5,
            "Meowth",
            R.drawable.meowth,
            types = listOf(PokemonType.NORMAL),
            description = "Adora moedas. Vagueia pelas ruas coletando moedas durante o dia e patrulha seu território à noite.",
            heightMeters = 0.4,
            weightKg = 4.2,
            hp = 40,
            attack = 45,
            defense = 35,
            specialAttack = 40,
            specialDefense = 40,
            speed = 90
        ),
        PokemonModel(
            id = 6,
            name = "Psyduck",
            imageRes = R.drawable.psyduck,
            types = listOf(PokemonType.AGUA),
            description = "Sofre constantemente com dores de cabeça. Quando a dor fica intensa, começa a usar poderes misteriosos.",
            heightMeters = 0.8,
            weightKg = 19.6,
            hp = 48,
            attack = 65,
            defense = 50,
            specialAttack = 50,
            specialDefense = 50,
            speed = 55
        ),
        PokemonModel(
            id = 7,
            name = "Gengar",
            imageRes = R.drawable.gengar,
            types = listOf(PokemonType.FANTASMA, PokemonType.VENEN0),
            description = "Na noite de lua cheia, se as sombras se movem sozinhas e riem, é obra de Gengar.",
            heightMeters = 1.5,
            weightKg = 40.5,
            hp = 60,
            attack = 65,
            defense = 60,
            specialAttack = 130,
            specialDefense = 75,
            speed = 110
        ),
        PokemonModel(
            id = 8,
            name = "Eevee",
            imageRes = R.drawable.eevee,
            types = listOf(PokemonType.NORMAL),
            description = "Seu código genético é irregular. Pode mutar se for exposto à radiação de pedras elementais.",
            heightMeters = 0.3,
            weightKg = 6.5,
            hp = 55,
            attack = 55,
            defense = 50,
            specialAttack = 45,
            specialDefense = 65,
            speed = 55
        ),
        PokemonModel(
            id = 9,
            name = "Snorlax",
            imageRes = R.drawable.snorlax,
            types = listOf(PokemonType.NORMAL),
            description = "Muito preguiçoso. Só come e dorme. Conforme seu corpo cresce, fica cada vez mais indolente.",
            heightMeters = 2.1,
            weightKg = 460.0,
            hp = 160,
            attack = 110,
            defense = 7,
            specialAttack = 65,
            specialDefense = 65,
            speed = 30
        )
    )

    fun findById(id: Int): PokemonModel? {
        return pokemon.find { it.id == id }
    }
}
