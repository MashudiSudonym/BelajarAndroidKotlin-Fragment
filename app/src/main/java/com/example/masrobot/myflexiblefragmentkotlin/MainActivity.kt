package com.example.masrobot.myflexiblefragmentkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mHomeFragment= HomeFragment()
        mFragmentTransaction.add(R.id.frame_container, mHomeFragment,
                mHomeFragment.javaClass.simpleName)

        Log.d("MyFlexibleFragment",
                "Fragment Name : ${mHomeFragment.javaClass.simpleName}")
        mFragmentTransaction.commit()
    }
}
