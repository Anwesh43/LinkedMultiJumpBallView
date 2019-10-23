package com.anwesh.uiprojects.linkedmultijumpballview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.multijumpballview.MultiJumpBallView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MultiJumpBallView.create(this)
    }
}
