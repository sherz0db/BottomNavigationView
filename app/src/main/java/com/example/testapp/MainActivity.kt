package com.example.testapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)
        replaceFragment(HomeFragment())

        bindingMain.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.settings -> replaceFragment(SettingsFragment())
                R.id.more  -> replaceFragment(MoreFragment())

                else -> {}
            }

            true
        }

    }

    private fun replaceFragment(fragment:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}


