package br.com.escolanovaeratech.listapokemonmock.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.escolanovaeratech.listapokemonmock.R
import br.com.escolanovaeratech.listapokemonmock.model.PokemonModel


class PokemonAdapter: ListAdapter<PokemonModel, PokemonAdapter.PokemonViewHolder>(PokemonDiffCallback) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: PokemonViewHolder,
        position: Int
    ) {
        val model = getItem(position)
        holder.bind(model)
    }

    class PokemonViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        private val imgPokemon: ImageView = itemView.findViewById(R.id.imgPokemon)
        private val textId: TextView = itemView.findViewById(R.id.textId)
        private val textName: TextView = itemView.findViewById(R.id.textName)

        fun bind(model: PokemonModel){
            imgPokemon.setImageResource(model.imageRes)
            textId.text = model.id.toString()
            textName.text = model.name
        }
            }

                     private object PokemonDiffCallback: DiffUtil.ItemCallback<PokemonModel>(){
                         override fun areItemsTheSame(
                             oldItem: PokemonModel,
                             newItem: PokemonModel
                         ): Boolean {
                            return   newItem.id == oldItem.id
                         }

                         override fun areContentsTheSame(
                             oldItem: PokemonModel,
                             newItem: PokemonModel
                         ): Boolean {
                             return newItem == oldItem
                         }

                     }
}