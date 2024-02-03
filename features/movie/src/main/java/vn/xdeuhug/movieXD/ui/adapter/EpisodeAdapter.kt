package vn.xdeuhug.movieXD.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.xdeuhug.movieXD.app.AppAdapter
import vn.xdeuhug.movieXD.model.modelTVMovie.Episode
import vn.xdeuhug.movieXD.databinding.ItemEpisodeBinding

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 02 / 02 / 2024
 */
class EpisodeAdapter(context: Context) : AppAdapter<Episode>(context) {
    var onClickItem: OnClickItemEpisode? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding = ItemEpisodeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    inner class ViewHolder(private val binding: ItemEpisodeBinding) : AppViewHolder(binding.root) {
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
            binding.tvName.text = item.id.toString()
            binding.root.isSelected = item.isSelected
        }

    }

    interface OnClickItemEpisode {
        fun onClick(episode: Episode, position: Int)
    }
}