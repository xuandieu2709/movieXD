package vn.xdeuhug.movieXD.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.ActivityResultLauncher
import com.luck.picture.lib.basic.PictureSelectionModel
import com.luck.picture.lib.basic.PictureSelector
import com.luck.picture.lib.config.SelectMimeType
import com.luck.picture.lib.config.SelectModeConfig
import com.luck.picture.lib.entity.LocalMedia
import com.luck.picture.lib.interfaces.OnResultCallbackListener
import com.luck.picture.lib.language.LanguageConfig
import com.luck.picture.lib.style.PictureSelectorStyle
import vn.xdeuhug.movieXD.other.GlideEngine


object PhotoPickerUtils {
    private var selectorStyle: PictureSelectorStyle? = null

    fun showImagePickerChooseAvatar(
        activity: Activity, intent: ActivityResultLauncher<Intent>
    ) {
        PictureSelector.create(activity).openSystemGallery(SelectMimeType.ofImage())
            .setSelectionMode(SelectModeConfig.SINGLE).forSystemResultActivity(intent)
    }

    fun showImagePickerUploadPost(
        activity: Activity,
        intent: ActivityResultLauncher<Intent>,
        selectedMediaList: ArrayList<LocalMedia>
    ) {
        // styleSelector(activity)
        val selectionModel: PictureSelectionModel =
            PictureSelector.create(activity).openGallery(SelectMimeType.ofAll())
                .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
                .isUseSystemVideoPlayer(true).setSelectionMode(SelectModeConfig.MULTIPLE)
                .setLanguage(LanguageConfig.VIETNAM).isDisplayCamera(true)
                .isWithSelectVideoImage(true).isPreviewFullScreenMode(true)
                .isPreviewZoomEffect(true).isPreviewImage(true).isPreviewVideo(true)
                .isPreviewAudio(true).setMaxSelectNum(4).setMaxVideoSelectNum(1)
                .setSelectMaxFileSize(10240).isGif(true)
                .setSelectedData(selectedMediaList)
        selectionModel.forResult(intent)
    }

    fun showImagePickerUploadPosterInEvent(
        activity: Activity,
        intent: ActivityResultLauncher<Intent>,
        selectedMediaList: ArrayList<LocalMedia>
    ) {
        // styleSelector(activity)
        val selectionModel: PictureSelectionModel =
            PictureSelector.create(activity).openGallery(SelectMimeType.ofImage())
                .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
                .isUseSystemVideoPlayer(true).setSelectionMode(SelectModeConfig.SINGLE)
                .setLanguage(LanguageConfig.VIETNAM).isDisplayCamera(true)
                .isWithSelectVideoImage(true).isPreviewFullScreenMode(true)
                .isPreviewZoomEffect(true).isPreviewImage(true).isPreviewVideo(true)
                .isPreviewAudio(true).setMaxSelectNum(1).isGif(true)
                .setSelectedData(selectedMediaList)
        selectionModel.forResult(intent)
    }


    fun showImagePickerUploadComment(
        activity: Activity,
        intent: ActivityResultLauncher<Intent>,
        selectedMediaList: ArrayList<LocalMedia>
    ) {
        // styleSelector(activity)
        val selectionModel: PictureSelectionModel =
            PictureSelector.create(activity).openGallery(SelectMimeType.ofAll())
                .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
                .isUseSystemVideoPlayer(true).setSelectionMode(SelectModeConfig.SINGLE)
                .setLanguage(LanguageConfig.VIETNAM).isDisplayCamera(true)
                .isWithSelectVideoImage(true).isPreviewFullScreenMode(true)
                .isPreviewZoomEffect(true).isPreviewImage(true).isPreviewVideo(true)
                .isPreviewAudio(true).setMaxSelectNum(1).setMaxVideoSelectNum(1).isGif(true)
                .setSelectedData(selectedMediaList)
        selectionModel.forResult(intent)
    }

    fun showImagePickerChat(
        activity: Activity, intent: ActivityResultLauncher<Intent>
    ) {
        // styleSelector(activity)
        val selectionModel: PictureSelectionModel =
            PictureSelector.create(activity).openGallery(SelectMimeType.ofAll())
                .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
                .isUseSystemVideoPlayer(true).setSelectionMode(SelectModeConfig.MULTIPLE)
                .setLanguage(LanguageConfig.VIETNAM).isDisplayCamera(true)
                .isWithSelectVideoImage(true).isPreviewFullScreenMode(true)
                .isPreviewZoomEffect(true).isPreviewImage(true).isPreviewVideo(true)
                .isPreviewAudio(true).setMaxSelectNum(2).setMaxVideoSelectNum(1)
                .setSelectMaxDurationSecond(120)
                .setSelectMaxFileSize(10240).isGif(true)
        selectionModel.forResult(intent)
    }

    fun showImagePickerChooseAvatarNotGif(
        activity: Activity, intent: ActivityResultLauncher<Intent>
    ) {
//        // styleSelector(activity)
        PictureSelector.create(activity).openGallery(SelectMimeType.ofImage())
            .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
            .setLanguage(LanguageConfig.VIETNAM)
            .isDisplayCamera(false).setSelectionMode(SelectModeConfig.SINGLE).isGif(false)
            .forResult(intent)
    }


    fun showImagePickerNewsFeed(
        activity: Activity, intent: ActivityResultLauncher<Intent>, listData: ArrayList<LocalMedia>
    ) {
//        // styleSelector(activity)
        val selectionModel: PictureSelectionModel =
            PictureSelector.create(activity).openGallery(SelectMimeType.ofAll())
                .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
                .isUseSystemVideoPlayer(true).setSelectionMode(SelectModeConfig.MULTIPLE)
                .setLanguage(LanguageConfig.VIETNAM).isDisplayCamera(true)
                .isWithSelectVideoImage(true).isPreviewFullScreenMode(true)
                .isPreviewZoomEffect(true).isPreviewImage(true).isPreviewVideo(true)
                .isPreviewAudio(true).setMaxSelectNum(30).setMaxVideoSelectNum(5)
                .setSelectedData(listData).isGif(true)
        selectionModel.forResult(intent)
    }

    fun showImagePickerOneMedia(
        activity: Activity, intent: ActivityResultLauncher<Intent>, listData: ArrayList<LocalMedia>
    ) {
//        // styleSelector(activity)
        val selectionModel: PictureSelectionModel =
            PictureSelector.create(activity).openGallery(SelectMimeType.ofAll())
                .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
                .isUseSystemVideoPlayer(true).setSelectionMode(SelectModeConfig.MULTIPLE)
                .setLanguage(LanguageConfig.VIETNAM).isDisplayCamera(true)
                .isWithSelectVideoImage(true).isPreviewFullScreenMode(true)
                .isPreviewZoomEffect(true).isPreviewImage(true).isPreviewVideo(true)
                .isPreviewAudio(true).setMaxSelectNum(1).setMaxVideoSelectNum(1)
                .setSelectedData(listData).isGif(true)
        selectionModel.forResult(intent)
    }

    fun showImagePickerInDialog(
        context: Context,
        onResultCallbackListener: OnResultCallbackListener<LocalMedia>,
        listData: ArrayList<LocalMedia>
    ) {
//        styleSelector(context)
        val selectionModel: PictureSelectionModel =
            PictureSelector.create(context).openGallery(SelectMimeType.ofAll())
                .setSelectorUIStyle(selectorStyle).setImageEngine(GlideEngine.createGlideEngine())
                .isUseSystemVideoPlayer(true).setSelectionMode(SelectModeConfig.MULTIPLE)
                .setLanguage(LanguageConfig.VIETNAM).isDisplayCamera(true)
                .isWithSelectVideoImage(true).isPreviewFullScreenMode(true)
                .isPreviewZoomEffect(true).isPreviewImage(true).isPreviewVideo(true)
                .isPreviewAudio(true).setMaxSelectNum(1).setMaxVideoSelectNum(1)
                .setSelectedData(listData).isGif(true)
        selectionModel.forResult(onResultCallbackListener)
    }

//    private fun styleSelector(context: Context) {
//        selectorStyle = PictureSelectorStyle()
//
//        val whiteTitleBarStyle = TitleBarStyle()
//        whiteTitleBarStyle.titleBackgroundColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_white)
//        whiteTitleBarStyle.titleDrawableRightResource =
//            vn.xdeuhug.seniorsociable.R.drawable.ic_arrow_down_orange
//        whiteTitleBarStyle.titleLeftBackResource =
//            vn.xdeuhug.seniorsociable.R.drawable.ic_back_gray_group
//        whiteTitleBarStyle.titleTextColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_black)
//        whiteTitleBarStyle.titleCancelTextColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_53575e)
//        whiteTitleBarStyle.isDisplayTitleBarLine = true
//
//        val whiteBottomNavBarStyle = BottomNavBarStyle()
//        whiteBottomNavBarStyle.bottomNarBarBackgroundColor = Color.parseColor("#EEEEEE")
//        whiteBottomNavBarStyle.bottomPreviewSelectTextColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_53575e)
//
//        whiteBottomNavBarStyle.bottomPreviewNormalTextColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_9b)
//        whiteBottomNavBarStyle.bottomPreviewSelectTextColor = ContextCompat.getColor(
//            context, vn.xdeuhug.seniorsociable.R.color.blue_app_senior_sociable
//        )
//        whiteBottomNavBarStyle.isCompleteCountTips = false
//        whiteBottomNavBarStyle.bottomEditorTextColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_53575e)
//        whiteBottomNavBarStyle.bottomOriginalTextColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_53575e)
//
//        val selectMainStyle = SelectMainStyle()
//        selectMainStyle.statusBarColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_white)
//        selectMainStyle.isDarkStatusBarBlack = true
//        selectMainStyle.selectNormalTextColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_9b)
//        selectMainStyle.selectTextColor = ContextCompat.getColor(
//            context, vn.xdeuhug.seniorsociable.R.color.blue_app_senior_sociable
//        )
//        selectMainStyle.previewSelectBackground =
//            com.luck.picture.lib.R.drawable.ps_demo_white_preview_selector
//        selectMainStyle.selectBackground = com.luck.picture.lib.R.drawable.ps_checkbox_selector
//        selectMainStyle.setSelectText(com.luck.picture.lib.R.string.ps_done_front_num)
//        selectMainStyle.mainListBackgroundColor =
//            ContextCompat.getColor(context, com.luck.picture.lib.R.color.ps_color_white)
//
//        selectorStyle!!.titleBarStyle = whiteTitleBarStyle
//        selectorStyle!!.bottomBarStyle = whiteBottomNavBarStyle
//        selectorStyle!!.selectMainStyle = selectMainStyle
//    }


}