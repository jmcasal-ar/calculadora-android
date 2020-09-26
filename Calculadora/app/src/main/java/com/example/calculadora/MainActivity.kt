package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    /*Aca declaramos las variables del layout*/
    private lateinit var  etNumero1: EditText
    private lateinit var  etNumero2: EditText
    private lateinit var  btnSumar: Button
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*CREAMOS UN METODO PARA INICIALIZAR LAS VARIABLES*/
        setupUI()

    }

    /*fun es para activar la función*/
    fun setupUI() {
        /*Asi asignamos una vista que es nuestra id a un objeto, como por ej ejemplo un textoview*/
        etNumero1 = findViewById(R.id.etNumero1)
        etNumero2 = findViewById(R.id.etNumero2)
        btnSumar = findViewById(R.id.btnSumar)

        btnSumar.setOnClickListener {
            //Escuchamos cuando se aprieta el botón
            //Realizamos la acción
            realizarSuma()
        }
    }

    private fun realizarSuma() {
        /*ACA EL PROFE LO DEJO MEDIO DESPROLIJO*/
        val numero1 = etNumero1.text.toString().toInt()
        val numero2 = etNumero2.text.toString().toInt()
        
        var resultadoSuma = sumar(numero1, numero2)

        lanzarResultadoActivity(resultadoSuma)
        


    }

    private fun lanzarResultadoActivity(resultado: Int) {
        //Ir hacia otra activity
        val intent = Intent(this, ResultadoActivity::class.java)
        //metodo para enviar parametros
        intent.putExtra("RESULTADO", resultado)
        //Metodo para comenzar la Activity
        startActivity(intent)
    }

    /*Distintas formas de escribir la función sumar*/
    private fun sumar(numero1: Int, numero2: Int) = numero1 + numero2
    private fun sumarInLine(numero1: Int, numero2: Int): Int = numero1 + numero2
    private fun sumarConCuerpo(numero1: Int, numero2: Int): Int {
        return  numero1 + numero2
    }


    //Ciclo de Vida de la aplicación
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
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