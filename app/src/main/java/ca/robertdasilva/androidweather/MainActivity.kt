package ca.robertdasilva.androidweather

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage.setText(R.string.title_todayForecast)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_weekForecast -> {
                textMessage.setText(R.string.title_weekForecast)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the current location

        // Get current weather data for given location


        // Needed for multi-page app
        //val navView: BottomNavigationView = findViewById(R.id.nav_view)

        textMessage = findViewById(R.id.message)
        // Needed for multi-page app
        //navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
