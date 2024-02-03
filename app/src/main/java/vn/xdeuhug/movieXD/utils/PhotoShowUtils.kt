package vn.xdeuhug.movieXD.utils

import android.content.Context
import android.graphics.Bitmap
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.google.common.base.Strings
import vn.xdeuhug.movieXD.R


object PhotoShowUtils {

    // Đang dùng
    fun getLinkPhoto(photo: String?): String {
        return String.format("%s%s", "", photo)
    }

    fun loadPhotoImageNormal(url: String, view: ImageView) {
        if (url.contains("/")) {
            Glide.with(view.context.applicationContext).asBitmap().load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                    RequestOptions().placeholder(R.drawable.ic_default)
                        .error(R.drawable.ic_default)
                ).into(view)
        } else {
            Glide.with(view.context.applicationContext).asBitmap().load(
                String.format(
                    "%s%s", "", url
                )
            ).diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                RequestOptions().placeholder(R.drawable.ic_default)
                    .error(R.drawable.ic_default)
            ).into(view)
        }
    }

    fun loadPhotoImagePreview(url: String, view: ImageView) {
        if (url.contains("/")) {
            Glide.with(view.context.applicationContext).load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                    RequestOptions().placeholder(R.drawable.ic_default)
                        .error(R.drawable.ic_default)
                ).into(view)
        } else {
            Glide.with(view.context.applicationContext).load(
                String.format(
                    "%s%s", "", url
                )
            ).diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                RequestOptions().placeholder(R.drawable.ic_default)
                    .error(R.drawable.ic_default)
            ).into(view)
        }
    }

    fun loadPhotoImagePreview(url: String, view: ImageView, callback: (width: Int, height: Int) -> Unit) {
        Glide.with(view.context.applicationContext)
            .asBitmap()
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .apply(
                RequestOptions()
                    .placeholder(R.drawable.ic_default)
                    .error(R.drawable.ic_default)
            )
            .addListener(object : RequestListener<Bitmap> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: com.bumptech.glide.request.target.Target<Bitmap>?,
                    isFirstResource: Boolean
                ): Boolean {
                    // Handle failure
                    return false
                }

                override fun onResourceReady(
                    resource: Bitmap?,
                    model: Any?,
                    target: com.bumptech.glide.request.target.Target<Bitmap>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    if (resource != null) {
                        val width = resource.width
                        val height = resource.height
                        callback(width, height)
                    }
                    return false
                }
            })
            .into(view)
    }



    fun loadPhotoRound(url: String, view: ImageView) {
        if (url.contains("/")) {
            Glide.with(view.context.applicationContext).asBitmap().load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                    RequestOptions().placeholder(R.drawable.ic_default)
                        .error(R.drawable.ic_default)
                ).centerCrop().transform(
                    MultiTransformation(
                        RoundedCorners(
                            view.context.resources.getDimension(R.dimen.dp_8).toInt()
                        )
                    )
                ).into(view)
        } else {
            Glide.with(view.context.applicationContext).asBitmap().load(
                String.format(
                    "%s%s", "", url
                )
            ).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().transform(
                MultiTransformation(
                    RoundedCorners(
                        view.context.resources.getDimension(R.dimen.dp_8).toInt()
                    )
                )
            ).apply(
                RequestOptions().placeholder(R.drawable.ic_default)
                    .error(R.drawable.ic_default)
            ).into(view)
        }
    }


    fun loadAvatarRound(url: String, view: ImageView) {
        if (url.contains("/")) {
            Glide.with(view.context.applicationContext).asBitmap().load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                    RequestOptions().placeholder(R.drawable.ic_user_default)
                        .error(R.drawable.ic_user_default)
                ).centerCrop().transform(
                    MultiTransformation(
                        RoundedCorners(
                            view.context.resources.getDimension(R.dimen.dp_8).toInt()
                        )
                    )
                ).into(view)
        } else {
            Glide.with(view.context.applicationContext).asBitmap().load(
                String.format(
                    "%s%s", "", url
                )
            ).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().transform(
                MultiTransformation(
                    RoundedCorners(
                        view.context.resources.getDimension(R.dimen.dp_8).toInt()
                    )
                )
            ).apply(
                RequestOptions().placeholder(R.drawable.ic_user_default)
                    .error(R.drawable.ic_user_default)
            ).into(view)
        }
    }

    fun loadAvatarImage(url: String, view: ImageView) {
        Glide.with(view.context.applicationContext).asBitmap().load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                RequestOptions().placeholder(R.drawable.ic_user_default)
                    .error(R.drawable.ic_user_default)
            ).centerCrop().transform(MultiTransformation(CenterCrop(), CircleCrop())).into(view)
    }


    fun loadAvatarImageCenterCrop(url: String, view: ImageView) {
        Glide.with(view.context.applicationContext).asBitmap().load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                RequestOptions().placeholder(R.drawable.ic_default)
                    .error(R.drawable.ic_default)
            ).centerCrop().into(view)
    }

    //
    //Tải hình ảnh banner
    fun loadSignatureImage(url: String, view: ImageView) {
        if (url != "") {
            Glide.with(view.context.applicationContext).load(getLinkPhoto(url))
                .diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop()
                .transform(MultiTransformation(CenterCrop())).into(view)
        }
    }

    private fun getListMedia(photo: String): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList()
        if (!photo.contains("/")) arrayList.add(getLinkPhoto(photo)) else arrayList.add(
            photo
        )
        return arrayList
    }

    private fun getListMedia(photo: ArrayList<String>): ArrayList<String> {
        val arrayList: ArrayList<String> = ArrayList()
        for (i in photo.indices) {
            if (!photo[i].contains("/")) {
                arrayList.add(getLinkPhoto(photo[i]))
            } else arrayList.add(photo[i])
        }
        return arrayList
    }
    fun getBitmap(urlImage: String?, context: Context): Bitmap {
        val bitmapAvatar = if (Strings.isNullOrEmpty(urlImage)) {
            Glide.with(context).asBitmap().load(
                R.drawable.ic_user_default
            ).circleCrop().placeholder(R.drawable.ic_user_default).error(R.drawable.ic_user_default)
                .submit(100, 100).get()
        } else {
            try {
                Glide.with(context).asBitmap().load(urlImage).circleCrop()
                    .diskCacheStrategy(DiskCacheStrategy.ALL).apply(
                        RequestOptions().placeholder(R.drawable.ic_user_default)
                            .error(R.drawable.ic_user_default)
                    ).submit(100, 100).get()
            } catch (e: Exception) {
                Glide.with(context).asBitmap().load(
                    R.drawable.ic_user_default
                ).circleCrop().placeholder(R.drawable.ic_user_default)
                    .error(R.drawable.ic_user_default).submit(100, 100)//480 320
                    .get()
            }
        }
        return bitmapAvatar
    }

    fun getBitmapDimensions(context: Context, imageUrl: String, callback: (width: Int, height: Int) -> Unit) {
        Glide.with(context)
            .asBitmap()
            .load(imageUrl)
            .listener(object : RequestListener<Bitmap> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: com.bumptech.glide.request.target.Target<Bitmap>?,
                    isFirstResource: Boolean
                ): Boolean {
                    // Handle failure
                    return false
                }

                override fun onResourceReady(
                    resource: Bitmap?,
                    model: Any?,
                    target: com.bumptech.glide.request.target.Target<Bitmap>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    if (resource != null) {
                        val width = resource.width
                        val height = resource.height
                        callback(width, height)
                    }
                    return false
                }
            })
            .submit() // Do not load the image immediately, just submit to get information
    }
}