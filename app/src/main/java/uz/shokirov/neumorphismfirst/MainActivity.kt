package uz.shokirov.neumorphismfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import soup.neumorphism.NeumorphButton

class MainActivity : AppCompatActivity() {
    lateinit var dashboard:NeumorphButton
    lateinit var first:NeumorphButton
    lateinit var second:NeumorphButton
    lateinit var musicPlayer:NeumorphButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        dashboard = findViewById(R.id.dashboard)
        first = findViewById(R.id.sign1)
        second = findViewById(R.id.sign2)
        musicPlayer = findViewById(R.id.musicPlayer)

        dashboard.setOnClickListener {
            startActivity(Intent(this,DashboardActivity::class.java))
        }
        first.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        second.setOnClickListener {
            startActivity(Intent(this,LoginActivity2::class.java))
        }
        musicPlayer.setOnClickListener {
            startActivity(Intent(this,MusicPlaerActivity::class.java))
        }



    }
}