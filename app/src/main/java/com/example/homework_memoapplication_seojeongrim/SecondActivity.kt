package com.example.homework_memoapplication_seojeongrim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_memoapplication_seojeongrim.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var activitySecondBinding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activitySecondBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(activitySecondBinding.root)

        activitySecondBinding.apply {
            toolbar2.apply {
                title = "<- 메모 작성"

                setNavigationIcon(R.drawable.add_24px)

                setNavigationOnClickListener {
                    finish()
                }
            }
        }
    }
}