package br.com.escolanovaeratech.listapokemonmock

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.recyclerview.widget.RecyclerView
import br.com.escolanovaeratech.listapokemonmock.adapter.PokemonAdapter
import br.com.escolanovaeratech.listapokemonmock.data.PokemonMock

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val rvPokemon = findViewById<RecyclerView>(R.id.recyclerViewPokemon)
        applayWindowInsets(rvPokemon)

        val adapter = PokemonAdapter(){
            startActivity(Intent(this, DetailActivity::class.java))

        }

        rvPokemon.adapter = adapter

        val pokemons = PokemonMock.pokemon

        adapter.submitList(pokemons)

    }

       private  fun applayWindowInsets(recyclerView: RecyclerView) {
           ViewCompat.setOnApplyWindowInsetsListener(recyclerView) { view, insets ->
               val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
               view.updatePadding(
                   top = recyclerView.paddingTop + bars.top,
                   bottom = recyclerView.paddingBottom + bars.bottom
               )

               insets
            }
       }
    }
