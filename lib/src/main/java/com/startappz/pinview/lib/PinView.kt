package com.startappz.pinview.lib

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class PinView : AppCompatEditText {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    constructor(context: Context, attrs: AttributeSet) : this(context, attrs, 0)
}