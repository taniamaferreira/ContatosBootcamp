package com.example.contatosbootcamp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    val REQUEST_CONTACT = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.READ_CONTACTS) !=
                packageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_CONTACTS),
                    REQUEST_CONTACT)
        } else {
            setContacts()
        }
    }

    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
    ) {
        if (requestCode == REQUEST_CONTACT) setContacts()

        private fun setContacts() {
            val contact
        }

    }
}
     //Terminar projeto
    // Download do slide: https://drive.google.com/file/d/1WbVvZ9aWLhyGHebl1uodxx1YngqTweOT/view?usp=sharing
  // terminar projeto recurso de camera
  //  Download do slide: https://drive.google.com/file/d/1AxY8iY361-KGAbRAYUwGHmIFJ_3R-qkZ/view?usp=sharing
 // terminar projeto recurso de localização
//Download do slide: https://drive.google.com/file/d/1_OkuSlVclCod24bcpKcmogbUxUmkG9kQ/view?usp=sharing
//terminar projeto recurso de wacth
//Download do slide: https://drive.google.com/file/d/1RpMwopH4AJ4mmzXHFko3hUP891uhorH9/view?usp=sharing



fun main(){

    println()
}

