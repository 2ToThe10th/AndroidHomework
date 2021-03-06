package com.github.twoToThe10th

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val openProfileButton: View = findViewById(R.id.open_profile_button)
        openProfileButton.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        val sendEmailButton: View = findViewById(R.id.send_email_button)
        sendEmailButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // only email apps should handle this
                putExtra(Intent.EXTRA_EMAIL, arrayOf("grib.a@phystech.edu"))
                putExtra(Intent.EXTRA_SUBJECT, "Очень важное сообщение")
                putExtra(Intent.EXTRA_TEXT, "Ваше приложение работает!!!!!!!!!\nРадуйтесь)))")
            }
            startActivity(intent)
        }
    }
}