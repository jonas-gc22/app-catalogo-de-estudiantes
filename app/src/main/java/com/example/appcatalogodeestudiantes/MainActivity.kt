package com.example.appcatalogodeestudiantes

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listaEstudiantes: ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etMatricula = findViewById<EditText>(R.id.etMatricula)
        val spCarrera = findViewById<Spinner>(R.id.spCarrera)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val imgCarrera = findViewById<ImageView>(R.id.imgCarrera)
        val listView = findViewById<ListView>(R.id.listViewEstudiantes)

        val carreras = arrayOf("Ingeniería", "Medicina", "Derecho")

        val spinnerAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            carreras
        )
        spCarrera.adapter = spinnerAdapter

        listaEstudiantes = ArrayList()

        adapter = object : ArrayAdapter<String>(
            this,
            R.layout.item_estudiante,
            R.id.txtEstudiante,
            listaEstudiantes
        ) {}

        listView.adapter = adapter

        btnRegistrar.setOnClickListener {

            val nombre = etNombre.text.toString().trim()
            val matricula = etMatricula.text.toString().trim()

            if (nombre.isEmpty() || matricula.isEmpty()) {
                Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val carrera = spCarrera.selectedItem.toString()

            val estudiante =
                "Nombre: $nombre\nMatrícula: $matricula\nCarrera: $carrera"

            listaEstudiantes.clear()
            listaEstudiantes.add(estudiante)
            adapter.notifyDataSetChanged()

            // Animación segura
            imgCarrera.animate().cancel()
            imgCarrera.alpha = 0f

            when (spCarrera.selectedItemPosition) {
                0 -> imgCarrera.setImageResource(R.drawable.ingenieria)
                1 -> imgCarrera.setImageResource(R.drawable.medicina)
                2 -> imgCarrera.setImageResource(R.drawable.derecho)
            }

            imgCarrera.animate()
                .alpha(1f)
                .setDuration(400)
                .start()

            etNombre.text.clear()
            etMatricula.text.clear()
        }
    }
}