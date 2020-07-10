package me.buck.jitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.buck.jitpack.libaar.AarUtils
import me.buck.jitpack.libjar.JarUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AarUtils.hello()
        JarUtils().hello()
    }
}