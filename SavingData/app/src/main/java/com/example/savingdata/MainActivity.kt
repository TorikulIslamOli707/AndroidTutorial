package com.example.savingdata

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.savingdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    lateinit var sharedPreference: SharedPreferences

    var count = 0
    var name: String? = null
    var extraStr: String? = null
    var isCheck: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        var view = mainBinding.root

        setContentView(view)

        mainBinding.zeroBtnId.setOnClickListener{
            count++
            mainBinding.zeroBtnId.text = "$count"
        }
    }
    override fun onPause(){
        super.onPause()

        saveData()
    }

    fun saveData(){
        sharedPreference = this.getSharedPreferences("savingData", MODE_PRIVATE)

        name = mainBinding.nameEtdTxtId.text.toString()
        extraStr = mainBinding.largeEtdTxtId.text.toString()
        isCheck = mainBinding.checkBoxId.isChecked

        val editor = sharedPreference.edit()

        editor.putString("key name",name)
        editor.putString("key message", extraStr)
        editor.putInt("key count", count)
        editor.putBoolean("key remember", isCheck!!)

        editor.apply()

        Toast.makeText(applicationContext, "Your data is saved", Toast.LENGTH_SHORT).show()

    }

    fun retrive(){
        sharedPreference = this.getSharedPreferences("savingData", MODE_PRIVATE)

        name = sharedPreference.getString("key name", null)
        extraStr = sharedPreference.getString("key message", null)
        count = sharedPreference.getInt("key count", 0)
        isCheck = sharedPreference.getBoolean("key remember", false)

        mainBinding.nameEtdTxtId.setText(name)
        mainBinding.largeEtdTxtId.setText(extraStr)
        mainBinding.zeroBtnId.text = "$count"
        mainBinding.checkBoxId.isChecked = isCheck!!

    }

    override fun onResume(){
        super.onResume()

        retrive()
    }
}