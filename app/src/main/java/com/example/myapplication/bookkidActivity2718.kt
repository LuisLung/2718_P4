package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class bookkidActivity2718 : AppCompatActivity() {
    lateinit var binding: bookkidActivity2718


    override fun onCreate(savedInstanceState: Bundle?)
    super.onCreate(savedInstanceState)
    binding = ActivityBookKidBinding.inflate(LayoutInflater)
    setContentView(binding.root)

    //event saat button Fairy di klik
    binding.buttonFairy.setOnClickListener
    {
        it: View!
        replaceFragment(FairyFragment())
    }

    //event saat button Fable di klik
    binding.buttonFable.setOnClickListener
    {
        fit: View!
        replaceFragment(FableFragment())
    }

    //event saat button Science di klik
    binding.buttonScience.setOnClickListener
    {
        it: View!
        replaceFragment(ScienceFragment())
    }

    private fun replaceFragment(frgFragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fraqmentKidBook, frg)
        fragmentTrx.commit()
    }
}

