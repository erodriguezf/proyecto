package com.example.proyecto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.R.id.recyc
import kotlinx.android.synthetic.main.row.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(recyc)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val ciudades = ArrayList<Ciudad>()

        ciudades.add(Ciudad("Barranquilla",27,R.drawable.barranquilla))
        ciudades.add(Ciudad("Bogotá",10,R.drawable.bogota))
        ciudades.add(Ciudad("Bucaramanga",20,R.drawable.bucaramanga))
        ciudades.add(Ciudad("Cali",30,R.drawable.cali))
        ciudades.add(Ciudad("Cartagena",30,R.drawable.cartagena))
        ciudades.add(Ciudad("Cucuta",19,R.drawable.cucuta))
        ciudades.add(Ciudad("Ibague",22,R.drawable.ibague))
        ciudades.add(Ciudad("Medellin",19,R.drawable.medellin))
        ciudades.add(Ciudad("Pereira",15,R.drawable.pereira))
        ciudades.add(Ciudad("Soledad",27,R.drawable.soledad))


        val adapter = Adapter(ciudades)

        recyclerView.adapter= adapter








    }
}
