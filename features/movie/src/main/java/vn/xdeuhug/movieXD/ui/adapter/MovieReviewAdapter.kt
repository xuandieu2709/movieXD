package vn.xdeuhug.movieXD.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import vn.xdeuhug.movieXD.app.AppAdapter
import vn.xdeuhug.movieXD.databinding.ItemMovieBinding
import vn.xdeuhug.movieXD.databinding.ItemMovieReviewBinding
import vn.xdeuhug.movieXD.model.modelListMovie.Movie
import vn.xdeuhug.movieXD.router.APITheMovieDBRouter
import vn.xdeuhug.movieXD.utils.PhotoShowUtils

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 31 / 01 / 2024
 */
class MovieReviewAdapter(context: Context) : AppAdapter<Movie>(context) {
    var onClickItem: OnClickItem? = null
    private var isSearch = false

    constructor(context: Context, isSearch: Boolean) : this(context) {
        this.isSearch = isSearch
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        return if (isSearch) {
            val binding =
                ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            ViewHolderSearch(binding)
        } else {

            val binding =
                ItemMovieReviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            ViewHolder(binding)
        }
    }

    inner class ViewHolder(private val binding: ItemMovieReviewBinding) :
        AppViewHolder(binding.root) {
        init {
            binding.root.clickWithDebounce {
                val position = bindingAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onClickItem!!.onClick(getItem(position))
                }
            }
        }

        override fun onBindView(position: Int) {
            val item = getItem(position)
            setRate(item)
            PhotoShowUtils.loadPhotoImageNormal(
                APITheMovieDBRouter.HOST_IMAGE_BIG_SIZE + item.posterPath, binding.imvMovie
            )
            if (item.mediaType != "tv") {
                binding.tvTitle.text = item.title
            } else {
                binding.tvTitle.text = item.originalName
            }
        }

        @SuppressLint("DiscouragedApi")
        private fun setRate(item: Movie) {
            when(item.voteAverage){
                in 0.0 .. 2.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 2.0 .. 4.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 4.0 .. 6.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 6.0 .. 8.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 8.0 .. 10.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                }
            }
        }


    }

    inner class ViewHolderSearch(private val binding: ItemMovieBinding) :
        AppViewHolder(binding.root) {
        init {
            binding.root.clickWithDebounce {
                val position = bindingAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onClickItem!!.onClick(getItem(position))
                }
            }
        }

        override fun onBindView(position: Int) {
            val item = getItem(position)
            setRate(item)
            if (item.knownFor.isNotEmpty()) {

                PhotoShowUtils.loadPhotoImageNormal(
                    APITheMovieDBRouter.HOST_IMAGE_BIG_SIZE + item.knownFor[0].posterPath,
                    binding.imvMovie
                )
                if (item.knownFor[0].mediaType != "tv") {
                    binding.tvTitle.text = item.knownFor[0].title
                } else {
                    binding.tvTitle.text = item.knownFor[0].originalTitle
                }
            } else {

                PhotoShowUtils.loadPhotoImageNormal(
                    APITheMovieDBRouter.HOST_IMAGE_BIG_SIZE + item.posterPath, binding.imvMovie
                )
                if (item.mediaType != "tv") {
                    binding.tvTitle.text = item.title
                } else {
                    binding.tvTitle.text = item.originalName
                }
            }

        }

        @SuppressLint("DiscouragedApi")
        private fun setRate(item: Movie) {
            when(item.voteAverage){
                in 0.0 .. 2.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 2.0 .. 4.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 4.0 .. 6.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 6.0 .. 8.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star_not_active", "drawable", getContext().packageName))
                }
                in 8.0 .. 10.0 ->{
                    binding.imvStart1.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart2.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart3.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart4.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                    binding.imvStart5.setImageResource(getResources().getIdentifier("ic_star", "drawable", getContext().packageName))
                }
            }
        }

    }

    interface OnClickItem {
        fun onClick(movie: Movie)
    }
}