package org.jik.appcenterandroidstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn_login)
        var id = findViewById<EditText>(R.id.edit_id)
        var password = findViewById<EditText>(R.id.edit_password)
        btn.setOnClickListener {
            if (id.text.toString() == "" ) {
                Toast.makeText(this, "아이디 혹은 비밀번호를 입력하지 않았습니다.", Toast.LENGTH_SHORT).show()
                id.requestFocus();
            }
            else if (password.text.toString() == ""){
                Toast.makeText(this, "아이디 혹은 비밀번호를 입력하지 않았습니다.", Toast.LENGTH_SHORT).show()
                password.requestFocus();
            }
            else {
                findViewById<TextView>(R.id.not_correct).visibility = View.VISIBLE
            }
        }
    }
}