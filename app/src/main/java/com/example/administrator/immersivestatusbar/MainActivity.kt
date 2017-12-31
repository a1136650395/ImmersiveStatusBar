package com.example.administrator.immersivestatusbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resizeStatusBarHeight()
    }
    /**
     * 得到statusBar高度
     * */
    private fun getStatusBarHeight():Int{
        //得到statusBar的id
        val statusBarId = resources.getIdentifier("status_bar_height", "dimen", "android")
        //得到像素size
        return resources.getDimensionPixelSize(statusBarId)
    }
    private fun resizeStatusBarHeight(){
        val layoutParams = statusBar.layoutParams
        layoutParams.height=getStatusBarHeight()
    }
}
