package com.example.miapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.miapp.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddNoteBinding
    private lateinit var db:NoteDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db=NoteDatabaseHelper(this)

        binding.saveButtom.setOnClickListener {
            val title=binding.titleEditText.text.toString()
            val content=binding.contentEditText.text.toString()
            if (title.isEmpty() || content.isEmpty()){
                Toast.makeText(this, "El titulo o el contenido no pueden estar vacíos", Toast.LENGTH_SHORT).show()
            }else{
                val note= Note(0,title,content)
                db.insertNote(note)
                finish()
                Toast.makeText(this, "Tarea Agregada", Toast.LENGTH_SHORT).show()
            }
        }
    }
}