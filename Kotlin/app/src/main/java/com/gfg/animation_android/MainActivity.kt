package com.gfg.animation_android

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var blinkBTN: Button
    private lateinit var rotateBTN: Button
    private lateinit var fadeBTN: Button
    private lateinit var moveBTN: Button
    private lateinit var slideBTN: Button
    private lateinit var zoomBTN: Button
    private lateinit var stopBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageview)
        blinkBTN = findViewById(R.id.BTNblink)
        rotateBTN = findViewById(R.id.BTNrotate)
        fadeBTN = findViewById(R.id.BTNfade)
        moveBTN = findViewById(R.id.BTNmove)
        slideBTN = findViewById(R.id.BTNslide)
        zoomBTN = findViewById(R.id.BTNzoom)
        stopBTN = findViewById(R.id.BTNstop)

        createAnimation(blinkBTN, R.anim.blink_animation)
        createAnimation(rotateBTN, R.anim.rotate_animation)
        createAnimation(fadeBTN, R.anim.fade_animation)
        createAnimation(moveBTN, R.anim.move_animation)
        createAnimation(slideBTN, R.anim.slide_animation)
        createAnimation(zoomBTN, R.anim.zoom_animation)

        stopBTN.setOnClickListener {
            imageView.clearAnimation()
        }
    }

    private fun createAnimation(view: View, animationResId: Int) {
        view.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, animationResId)
            imageView.startAnimation(animation)
        }
    }
}
