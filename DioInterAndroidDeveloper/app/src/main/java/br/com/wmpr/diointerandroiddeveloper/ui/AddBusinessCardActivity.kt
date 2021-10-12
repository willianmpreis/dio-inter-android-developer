package br.com.wmpr.diointerandroiddeveloper.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.wmpr.diointerandroiddeveloper.App
import br.com.wmpr.diointerandroiddeveloper.R
import br.com.wmpr.diointerandroiddeveloper.data.BusinessCard
import br.com.wmpr.diointerandroiddeveloper.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insetListeners()
    }

    private fun insetListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }

        binding.btnConfirm.setOnClickListener {
            val businessCard = BusinessCard(
                name = binding.tilName.editText?.text.toString(),
                phone = binding.tilPhone.editText?.text.toString(),
                company = binding.tilCompany.editText?.text.toString(),
                email = binding.tilEmail.editText?.text.toString(),
                backgroundColor = binding.tilColor.editText?.text.toString().uppercase(),
            )

            mainViewModel.insert(businessCard)
            Toast.makeText(this, R.string.label_show_sucess, Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}