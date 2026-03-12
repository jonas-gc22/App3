package com.example.app3

import android.app.AlertDialog
import android.os.Bundle
import android.view.Gravity
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var lista: ArrayList<String>
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listEstudiantes)
        val btnAgregar = findViewById<LinearLayout>(R.id.layoutAgregar)

        lista = ArrayList()

        adapter = ArrayAdapter(
            this,
            R.layout.item_estudiante,
            R.id.txtNombre,
            lista
        )

        listView.adapter = adapter

        btnAgregar.setOnClickListener {
            mostrarDialogo(listView)
        }

        listView.setOnItemClickListener { _, _, position, _ ->

            val nombre = lista[position]

            val toast = Toast.makeText(
                this,
                "Seleccionaste $nombre",
                Toast.LENGTH_SHORT
            )

            toast.setGravity(Gravity.TOP, 0, 200)
            toast.show()
        }
    }

    private fun mostrarDialogo(listView: ListView) {

        val view = layoutInflater.inflate(
            R.layout.dialog_agregar_estudiante,
            null
        )

        val inputNombre = view.findViewById<EditText>(R.id.inputNombre)
        val spinner = view.findViewById<Spinner>(R.id.spinnerCarrera)

        val carreras = arrayOf(
            "Ingeniería de Software",
            "Administración",
            "Contabilidad",
            "Derecho"
        )

        val adapterSpinner = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            carreras
        )

        spinner.adapter = adapterSpinner

        val dialog = AlertDialog.Builder(this)
            .setTitle("Nuevo Estudiante")
            .setView(view)
            .setPositiveButton("Agregar", null)
            .setNegativeButton("Cancelar", null)
            .create()

        dialog.show()

        val btnAgregarDialog = dialog.getButton(AlertDialog.BUTTON_POSITIVE)

        btnAgregarDialog.setOnClickListener {

            val nombre = inputNombre.text.toString().trim()

            if (nombre.isEmpty()) {
                inputNombre.error = "Ingrese el nombre del estudiante"
                inputNombre.requestFocus()
                return@setOnClickListener
            }

            val carrera = spinner.selectedItem.toString()

            val estudiante = "$nombre - $carrera"

            lista.add(estudiante)

            adapter.notifyDataSetChanged()

            val anim = AnimationUtils.loadAnimation(
                this,
                R.anim.anim_item_lista
            )

            listView.startAnimation(anim)

            val toast = Toast.makeText(
                this,
                "Estudiante agregado",
                Toast.LENGTH_SHORT
            )

            toast.setGravity(Gravity.TOP, 0, 200)
            toast.show()

            dialog.dismiss()
        }
    }
}