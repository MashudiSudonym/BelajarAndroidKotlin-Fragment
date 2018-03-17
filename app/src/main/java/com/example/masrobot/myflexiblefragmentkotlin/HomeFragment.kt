package com.example.masrobot.myflexiblefragmentkotlin


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)
        val btnCategory = view.findViewById<View>(R.id.btn_category) as Button
        btnCategory.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_category) {
            Toast.makeText(activity, "test", Toast.LENGTH_SHORT).show()
        }
    }
}// Required empty public constructor