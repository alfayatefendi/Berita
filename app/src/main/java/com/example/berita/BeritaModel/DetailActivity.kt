package com.example.berita.BeritaModel

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.berita.MainActivity
import com.example.berita.R
import kotlinx.android.synthetic.main.activity_detail.btn_back
import kotlinx.android.synthetic.main.activity_detail.img_toolbar
import kotlinx.android.synthetic.main.activity_detail.txt_TitleNews
import kotlinx.android.synthetic.main.activity_detail.txt_kontenNews

class DetailActivity : AppCompatActivity() {

    companion object {
        const val cont_TitleNews = "cont_TitleNews"
        const val cont_PhotoNews = "cont_PhotoNews"
        const val cont_KontenNews = "cont_KontenNews"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        txt_TitleNews.text = intent.getStringExtra(cont_TitleNews)
        txt_kontenNews.text = intent.getStringExtra(cont_KontenNews)
        img_toolbar.setImageResource(intent.getStringExtra(cont_PhotoNews)!!.toInt())

        btn_back.setOnClickListener {
            val toMain = Intent(this@DetailActivity, MainActivity::class.java)
            startActivity(toMain)
            finish()
        }
    }
}