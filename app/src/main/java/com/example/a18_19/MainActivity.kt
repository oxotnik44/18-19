package com.example.a18_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // TODO Auto-generated method stub
        var intent: Intent? = null
        intent = when (item.itemId) {
            R.id.m1 -> Intent(this, history::class.java)
            R.id.m2 -> Intent(this, ThreeDaysGrace::class.java)
            R.id.m3 -> Intent(this, OneX::class.java)
            R.id.m4 -> Intent(this, LifeStartsNow::class.java)
            R.id.m5 -> Intent(this, TransitOfVenus::class.java)
            R.id.m6 -> Intent(this, Human::class.java)
            R.id.m7 -> Intent(this, Outsider::class.java)
            else -> return super.onOptionsItemSelected(item)
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}