package com.loveon.ynimanitto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kakao.sdk.common.util.Utility



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var keyHash = Utility.getKeyHash(this)
        Log.d("TEST", "hash key and debug : $keyHash")
    }
}