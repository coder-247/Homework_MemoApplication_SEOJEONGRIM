package com.example.homework_memoapplication_seojeongrim

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_memoapplication_seojeongrim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)


        activityMainBinding.apply {
            toolbar.apply {
                // 타이틀
                title = "메모 관리"
                // 타이틀 문자열 색상
                setTitleTextColor(Color.WHITE)
                // res/menu/main_menu.xml 파일을 이용해 툴바의 메뉴를 생성한다.
                // id : 각 메뉴를 구분하기 위한 이름
                // title : 메뉴에 표시되는 문자열
                // showAsAction : 메뉴 항목을 툴바에 배치할 것인지를 설정한다.
                //     always : 항상 툴바에 배치한다.
                //     ifRoom : 공간이 허락할 경우 툴바에 배치한다.
                //     never : 툴바에 배치하지 않는다.
                //     withText : 아이콘이 설정되어 있을 경우 아이콘이 보여지고 공간이 허락되면 title 에
                //     설정된 문자열도 보인다.
                //
                inflateMenu(R.menu.main_menu)
                // 메뉴를 선택하면 동작하는 리스너
                // 매개변수에는 사용자가 선택한 메뉴 항목의 객체가 전달된다.
                setOnMenuItemClickListener {
                    // 선택한 메뉴의 id로 분기한다.
                    when(it.itemId){
                        R.id.menuItem1 -> textView.text = "메모 작성을 선택했습니다"
                        R.id.menuItem2 -> textView.text = "메모 저장을 선택했습니다"
                        R.id.menuItem3 -> textView.text = "메모 수정을 선택했습니다"
                        R.id.menuItem4 -> textView.text = "메모 삭제를 선택했습니다"
                    }

                    true
                }
            }

            buttonStartSecond.setOnClickListener {
                val newIntent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(newIntent)
            }
        }
    }
}
