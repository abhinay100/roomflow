package com.example.fabexplosion

import android.view.View
import android.view.animation.Animation


/**
 * Created by Abhinay on 12/12/24.
 *
 *
 */

fun View.startAnimation(animation: Animation, onEnd: () -> Unit) {
    animation.setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationStart(p0: Animation?) = Unit
        override fun onAnimationEnd(p0: Animation?) {
            onEnd()
        }
        override fun onAnimationRepeat(p0: Animation?)  = Unit

    })
    this.startAnimation(animation)
}