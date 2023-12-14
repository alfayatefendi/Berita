package com.example.berita.BeritaModel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.berita.BeritaModelclass.news
import com.example.berita.R
import kotlinx.android.synthetic.main.lay_berita.view.img_news
import kotlinx.android.synthetic.main.lay_berita.view.tvw_Desc
import kotlinx.android.synthetic.main.lay_berita.view.tvw_title

class NewsAdapter(private val context: Context, private val list: List<news>):

    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private var currentNews: news? = null
        private var currentPosition: Int = 0

        fun setData(currentnews: news, position: Int) {
            itemView.tvw_title.text = currentnews!!.title
            itemView.tvw_Desc.text = currentnews!!.desc
            itemView.img_news.setImageResource(currentnews!!.photo)

            this.currentNews
            this.currentPosition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataNews = list[position]
        holder.setData(dataNews, position)
        holder.itemView.setOnClickListener(){onItemClickCallBack.onItemClick(list[position])}
    }
    private lateinit var onItemClickCallBack: OnItemClickCallBack

    fun setOnClickCallBack(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack
    }
    interface OnItemClickCallBack {
        fun onItemClick(data: news)
    }
}