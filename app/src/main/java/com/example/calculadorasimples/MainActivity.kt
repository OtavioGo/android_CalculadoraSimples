package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadorasimples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var result1 = 0.0
    private var result2 = 0.0
    private var result3 = 0.0
    private var result4 = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.btSomar.setOnClickListener {
            var v1 = binding.editValor1.text.toString().toDouble()
            var v2 = binding.editValor2.text.toString().toDouble()
            result1 = v1 + v2
            binding.txtResultado.text = result1.toString()
        }

        binding.btSubtracao.setOnClickListener {
            var v1 = binding.editValor1.text.toString().toDouble()
            var v2 = binding.editValor2.text.toString().toDouble()
            result2 = v1 - v2
            binding.txtResultado.text = result2.toString()
        }

        binding.btDivisao.setOnClickListener {
            var v1 = binding.editValor1.text.toString().toDouble()
            var v2 = binding.editValor2.text.toString().toDouble()
            result3 = v1 / v2
            binding.txtResultado.text = result3.toString()
        }

        binding.btMultiplicacao.setOnClickListener {
            var v1 = binding.editValor1.text.toString().toDouble()
            var v2 = binding.editValor2.text.toString().toDouble()
            result4 = v1 * v2
            binding.txtResultado.text = result4.toString()
        }
    }
}