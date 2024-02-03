package vn.xdeuhug.movieXD.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import vn.xdeuhug.movieXD.app.AppAdapter
import vn.xdeuhug.movieXD.databinding.ItemGenreBinding
import vn.xdeuhug.movieXD.model.modelDetailMovie.Genre

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 02 / 02 / 2024
 */
class GenreAdapter(context: Context) : AppAdapter<Genre>(context) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemGenreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    inner class ViewHolder(private val binding: ItemGenreBinding) : AppViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        override fun onBindView(position: Int) {
            //
            val item = getItem(position)
            binding.tvName.text = item.name
        }

    }
}