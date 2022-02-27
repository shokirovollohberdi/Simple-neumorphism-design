package uz.shokirov.neumorphismfirst

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.MultipartBody.Part.Companion.create
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import uz.shokirov.model.CarsItem
import java.lang.Exception


class CarsActivity : AppCompatActivity() {
    private val TAG = "CarsActivity"
    lateinit var carsItem: CarsItem
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)


        
    }
}