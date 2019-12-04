package com.example.flextest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.flexbox.FlexDirection
import com.google.android.flexbox.FlexWrap
import com.google.android.flexbox.FlexboxLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = Adapter()

        recycler.layoutManager = FlexboxLayoutManager(this, FlexDirection.ROW, FlexWrap.NOWRAP)
        recycler.adapter = adapter
    }
}
