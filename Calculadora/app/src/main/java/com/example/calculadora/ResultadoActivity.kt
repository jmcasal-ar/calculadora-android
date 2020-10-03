package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ResultadoActivity : AppCompatActivity() {
    private val TAG = "ResultadoActivity"
    override fun onCreate(savedInstanceState: Bundle?) {

        Log.i(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val bundle = intent.extras
        val resultado = bundle?.getInt("RESULTADO") ?: 0

        Log.i(TAG, "El resultado es $resultado")
    }
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

}