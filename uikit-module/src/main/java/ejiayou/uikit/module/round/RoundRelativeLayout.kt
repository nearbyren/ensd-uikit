package ejiayou.uikit.module.round

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import ejiayou.uikit.module.R

/**
 * @description: 圆角RelativeLayout
 * @since: 1.0.0
 */
open class RoundRelativeLayout : RelativeLayout, IRoundImpl {
    override var helper: RHelper = RHelper(this)

    constructor(context: Context) : super(context) {
        init(null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        initAttrs(attrs)
        buildRoundBackground()
    }

    @SuppressLint("CustomViewStyleable")
    private fun initAttrs(attrs: AttributeSet?) {
        attrs?.let {
            val ta = context.obtainStyledAttributes(attrs, R.styleable.lib_uikit_RoundView)
            initRoundAttrs(ta)
            ta.recycle()
        }
    }
}