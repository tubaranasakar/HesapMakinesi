package com.example.hesapmakinesi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonTopla.setOnClickListener {
            val alinanDeger1 = binding.sayiGirisiBir.text.toString().toDoubleOrNull()
            val alinanDeger2 = binding.sayiGirisiIki.text.toString().toDoubleOrNull()

            if (alinanDeger1 != null && alinanDeger2 != null) {
                // Sayılar başarılı şekilde alınmışsa toplama işlemi yap
                    val toplam = alinanDeger1 + alinanDeger2
                    binding.sonuc.text = "Sonuç : $toplam"
            } else {
                // Kullanıcı geçersiz bir giriş yapmışsa hata mesajı göster
                binding.sonuc.text = "Lütfen geçerli sayılar girin!"
            }
        }

        binding.buttonCikart.setOnClickListener {
            val alinanDeger1 = binding.sayiGirisiBir.text.toString().toDoubleOrNull()
            val alinanDeger2 = binding.sayiGirisiIki.text.toString().toDoubleOrNull()

            if (alinanDeger1 != null && alinanDeger2 != null) {
                    val cıkarma = alinanDeger1 - alinanDeger2
                    binding.sonuc.text = "Sonuç : $cıkarma"
            } else {
                // Kullanıcı geçersiz bir giriş yapmışsa hata mesajı göster
                binding.sonuc.text = "Lütfen geçerli sayılar girin!"
            }
        }

        binding.buttonCarp.setOnClickListener {
            val alinanDeger1 = binding.sayiGirisiBir.text.toString().toDoubleOrNull()
            val alinanDeger2 = binding.sayiGirisiIki.text.toString().toDoubleOrNull()

            if (alinanDeger1 != null && alinanDeger2 != null) {
                    val carpim = alinanDeger1 * alinanDeger2
                    binding.sonuc.text = "Sonuç : $carpim"
            } else {
                // Kullanıcı geçersiz bir giriş yapmışsa hata mesajı göster
                binding.sonuc.text = "Lütfen geçerli sayılar girin!"
            }
        }

        binding.buttonBol.setOnClickListener {
            val alinanDeger1 = binding.sayiGirisiBir.text.toString().toDoubleOrNull()
            val alinanDeger2 = binding.sayiGirisiIki.text.toString().toDoubleOrNull()

            if (alinanDeger2 == 0.0) {
                binding.sonuc.text = "Sıfıra bölme hatası!"
                return@setOnClickListener
            }

            if (alinanDeger1 != null && alinanDeger2 != null) {
                    val bol = alinanDeger1 / alinanDeger2
                    binding.sonuc.text = "Sonuç : $bol"
            } else {
                // Kullanıcı geçersiz bir giriş yapmışsa hata mesajı göster
                binding.sonuc.text = "Lütfen geçerli sayılar girin!"
            }
        }

        binding.buttonSifirla.setOnClickListener {
            binding.sayiGirisiBir.text.clear()
            binding.sayiGirisiIki.text.clear()
            binding.sonuc.text = " "
        }

    }
}