package vn.xdeuhug.movieXD.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.backgroundColor
import vn.xdeuhug.movieXD.R
import vn.xdeuhug.movieXD.app.AppAdapter
import vn.xdeuhug.movieXD.databinding.ItemGenreBinding
import vn.xdeuhug.movieXD.model.modelTVMovie.Season

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 02 / 02 / 2024
 */
class SeasonAdapter(context: Context) : AppAdapter<Season>(context) {
    var onClickItem: OnClickItemSeason? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemGenreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    inner class ViewHolder(private val binding: ItemGenreBinding) : AppViewHolder(binding.root) {
        init {
            binding.root.clickWithDebounce {
                val position = bindingAdapterPosition
                val item = getItem(position)
                if (position != RecyclerView.NO_POSITION) {
                    onClickItem!!.onClick(item, position)
                }
            }
        }

        @SuppressLint("SetTextI18n")
        override fun onBindView(position: Int) {
            //
            val item = getItem(position)
            binding.tvName.text = item.name
            binding.root.isSelected = item.isSelected
        }

    }

    interface OnClickItemSeason {
        fun onClick(season: Season,position: Int)
    }
}