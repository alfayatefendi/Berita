package com.example.berita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.berita.BeritaModel.DetailActivity
import com.example.berita.BeritaModel.NewsAdapter
import com.example.berita.BeritaModelclass.BeritaModel
import com.example.berita.BeritaModelclass.news
import kotlinx.android.synthetic.main.activity_main.cdv_newsheadline
import kotlinx.android.synthetic.main.activity_main.img_news0
import kotlinx.android.synthetic.main.activity_main.rcv_daftarberita
import kotlinx.android.synthetic.main.activity_main.tvw_DescHeadline
import kotlinx.android.synthetic.main.activity_main.tvw_TitleHeadLine

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val headlineNews: news?
        if (BeritaModel.newsList.isNotEmpty()) {
            headlineNews = BeritaModel.newsList[BeritaModel.newsList.size - 1]

            tvw_TitleHeadLine.text = headlineNews.title
            tvw_DescHeadline.text = headlineNews.desc
            img_news0.setImageResource(headlineNews.photo)

            cdv_newsheadline.setOnClickListener {
                val detail_intent = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headlineNews.title)
                        putExtra(DetailActivity.cont_KontenNews, headlineNews.desc)
                        putExtra(DetailActivity.cont_PhotoNews, headlineNews.photo.toString())
                    }
                startActivity(detail_intent)
                finish()
            }
        }
        val recyclerView = LinearLayoutManager(this)
        recyclerView.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = recyclerView

        newsAdapter = NewsAdapter(this, BeritaModel.newsList)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnClickCallBack(object: NewsAdapter.OnItemClickCallBack{
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title)
                        putExtra(DetailActivity.cont_KontenNews, data.desc)
                        putExtra(DetailActivity.cont_PhotoNews, data.photo)
                    }
                startActivity(intent)
                finish()
            }
        })
    }
}