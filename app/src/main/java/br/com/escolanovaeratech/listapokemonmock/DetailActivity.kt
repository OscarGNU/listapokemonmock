package br.com.escolanovaeratech.listapokemonmock

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.escolanovaeratech.listapokemonmock.data.PokemonMock

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textId = findViewById<TextView>(R.id.textId)
        val id = intent.getIntExtra("pokemonId", 1000)
        val pokemonModel = PokemonMock.findById(id)
        textId.text = pokemonModel?.name

    }
    companion object {
        private const val extraPokemonId = "pokemonId"

        fun createIntent(context: Context, pokemonId: Int): Intent {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(extraPokemonId, pokemonId)
            return intent
        }
    }
}