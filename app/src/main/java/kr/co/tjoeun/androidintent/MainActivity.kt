package kr.co.tjoeun.androidintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//         다이얼버튼
        dialBtn.setOnClickListener { 

//            전화번호 받아오자
            val inputPhonNum = phoneNumEdt.text.toString()

//            안드로이드에게 어디에 전화걸리 정보 전달 => uri 클래스
//            전화 uri 양식 - tel:010-7724-7767
            val myUri = Uri.parse("tel:${inputPhonNum}")

//            전화 화면으로 이동하는 Intent
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)

        }
        
    }
}