package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    /*Aca declaramos las variables del layout*/
    private lateinit var  etNumero1: EditText
    private lateinit var  txtResultado: TextView
    private lateinit var  btnSumar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*CREAMOS UN METODO PARA INICIALIZAR LAS VARIABLES*/
        setupUI()

    }

    /*fun es para activar la función*/
    fun setupUI() {
        /*Asi asignamos una vista que es nuestra id a un objeto, como por ej ejemplo un textoview*/
        etNumero1 = findViewById(R.id.etNumero1)
        txtResultado = findViewById(R.id.txtResultado)
        btnSumar = findViewById(R.id.btnSumar)

        btnSumar.setOnClickListener {
            //Escuchamos cuando se aprieta el botón
            //Realizamos la acción
            realizarSuma()
        }
    }

    private fun realizarSuma() {
        val numero1 = etNumero1.text.toString().toInt()
        val resultado = txtResultado.text.toString().toInt()
        
        var resultadoSuma = sumar(numero1, resultado)

        txtResultado.text = resultadoSuma.toString()
    }

    /*Distintas formas de escribir la función sumar*/
    private fun sumar(numero1: Int, numero2: Int) = numero1 + numero2
    private fun sumarInLine(numero1: Int, numero2: Int): Int = numero1 + numero2
    private fun sumarConCuerpo(numero1: Int, numero2: Int): Int {
        return  numero1 + numero2
    }

    val a =1
        /*
        val b = a/0

        val StringOfPares = arrayOf(2,4,6)

        val nombre: String = "Pepe"

        val edad = 10

        val texto = "Mi nombre es ${nombre.capitalize()} y tengo $edad años"

        val textoJava = "Mi nombre es " + nombre + "y tengo " + edad + "años"

        var grupoEtario = ""
        when (edad){
            in 0..17 -> grupoEtario = "Niño/Adolescente"
            in 18..99 -> grupoEtario = "Adulto"
            else -> grupoEtario = "Centenario"
        }

        var grupoEtario2 = when (edad) {
            in 0..17 -> "Niño/Adolescente"
            in 18..99 -> "Adulto"
            else -> "Centerio"
        }

        val persona = Persona("Nicolas")*/

}