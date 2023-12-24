package com.ibsu.android_onsaveinstancestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView
import com.ibsu.android_onsaveinstancestate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("Function call, onCreate", "onCreate called")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onStart() {
        super.onStart()
        Log.d("Function call, onStart", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Function call, onResume", "onResume called")
    }


    override fun onPause() {
        super.onPause()
        Log.d("Function call, onPause", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Function call, onStop", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Function call, onDestroy", "onDestroy called")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("Function call, onRestart", "onRestart called")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Function call, onSaveInstanceState", "onSaveInstanceState called")
        outState.putString("name", "Tengiz")
    }

//    This version of the method is used when dealing with persistent data
//    This is a bit less common and is used when you want to save state information that survives even if the process is killed and later restored.
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.d("Function call, onRestoreInstanceState", "onRestoreInstanceState called")
        findViewById<TextView>(R.id.tvName).text = savedInstanceState.getString("name", "Giorgi")
    }
}