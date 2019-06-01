package ca.robertdasilva.androidweather.UI

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate.*
import ca.robertdasilva.androidweather.R

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
        // Update this to pull from a settings parameter
        // Have the option to set
        // - Light
        // - Dark
        // - System default
        // For P and earlier, instead of -System default, provide
        // - Set by battery saver
        //setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the current location
        // TODO: Build method to check for location permission
        // TODO: Build method to get the current location on a schedule
        // TODO: Figure out how to check location when user is not using app
        // TODO: Get current weather data should be called on the schedule

        // Get current weather data for given location
        // TODO: Build class for weather data
        // WeatherData.getCurrentWeatherData()
        // TODO: Get current weather data should check for any data stored in database
        // TODO: Get current weather data should get new copy of weather data when app launches


        // Needed for multi-page app
        //val navView: BottomNavigationView = findViewById(R.id.nav_view)

        // textMessage = findViewById(R.id.message)
        // Needed for multi-page app
        //navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
    fun setLight(view: View) {
        setDefaultNightMode(MODE_NIGHT_NO)
        this.setTheme(R.style.Light)
        this.setContentView(R.layout.activity_main)
    }

    fun setDark(view: View) {
        setDefaultNightMode(MODE_NIGHT_YES)
        this.setTheme(R.style.DayNight)
        this.setContentView(R.layout.activity_main)

    }
    fun setSys(view: View) {
        setDefaultNightMode(MODE_NIGHT_FOLLOW_SYSTEM)
    }

}
