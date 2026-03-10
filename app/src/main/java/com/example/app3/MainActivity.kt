package com.example.app3

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var lista: ArrayList<String>
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listEstudiantes)
        val btnAgregar = findViewById<ImageButton>(R.id.btnAgregar)

        lista = ArrayList()

        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            lista
        )

        listView.adapter = adapter

        btnAgregar.setOnClickListener {

            val estudiante = "Estudiante ${lista.size + 1}"

            lista.add(estudiante)

            adapter.notifyDataSetChanged()

            Toast.makeText(
                this,
                "Estudiante agregado",
                Toast.LENGTH_SHORT
            ).show()
        }

        listView.setOnItemClickListener { _, _, position, _ ->

            val nombre = lista[position]

            Toast.makeText(
                this,
                "Seleccionaste $nombre",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}