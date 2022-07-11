package ejiayou.uikit.module.dialog

import android.view.Gravity
import ejiayou.uikit.module.R

/**
 * @author: Albert Li
 * @contact: albertlii@163.com
 * @time: 2021/9/8 11:02 上午
 * @description: 底部弹出框
 * @since: 1.0.0
 */
abstract class BaseBottomDialogFragment : BaseDialogFragment() {

    init {
        setGravity(Gravity.BOTTOM)
        setAnimationRes(R.style.fly_uikit_anim_InBottom_OutBottom)
    }
}