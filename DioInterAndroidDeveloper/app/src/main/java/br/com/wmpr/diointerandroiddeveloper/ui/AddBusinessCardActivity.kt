package br.com.wmpr.diointerandroiddeveloper.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.wmpr.diointerandroiddeveloper.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insetListeners()
    }

    private fun insetListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }

        binding.btnConfirm.setOnClickListener {  }
    }
}