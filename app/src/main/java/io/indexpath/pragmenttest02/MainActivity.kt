package io.indexpath.pragmenttest02

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fagmentLayout1,MyFragment()).commit()

        button.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

    }
}
