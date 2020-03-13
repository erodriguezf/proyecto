package com.example.proyecto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.ArrayList

class Adapter(var list: ArrayList<Ciudad>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    val v = LayoutInflater.from(parent?.context).inflate(R.layout.row,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])

    }

    override fun getItemCount(): Int{
        return list.size
    }


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){

        fun bindItems(data:Ciudad){
            val ciudad: TextView= itemView.findViewById(R.id.ciudad)
            val clima: TextView= itemView.findViewById(R.id.clima)
            val  imagen : ImageView = itemView.findViewById(R.id.image1)

            ciudad.text= data.ciudad
            clima.text=data.clima.toString()


            Glide.with(itemView.context).load(data.imagen).into(imagen)

           itemView.setOnClickListener {
               Toast.makeText(itemView.context,"clima de ${data.ciudad}",Toast.LENGTH_SHORT).show()
           }
        }

    }
}