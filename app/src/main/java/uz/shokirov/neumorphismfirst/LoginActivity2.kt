package uz.shokirov.neumorphismfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        supportActionBar?.hide()
    }
}