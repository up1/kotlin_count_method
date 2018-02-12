package cc.somkiat.demokotlin

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.content.edit
import androidx.net.toUri

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Kotlin
        val uri = Uri.parse("Hello")
        // KTX
        val uri2 = "Hello".toUri();

        val sharedPreferences = this.applicationContext.getSharedPreferences(this)

        //Kotlin
        sharedPreferences.edit()
                .putBoolean("key", true)
                .putBoolean("key2", true)
                .putString("key3", "Hello")
                .apply()
        //KTX
        sharedPreferences.edit {
            putBoolean("key1", true)
            putBoolean("key2", true)
            putString("key3", "Hello")
        }

    }
}

class User(val id: Int, val firstname: String)
