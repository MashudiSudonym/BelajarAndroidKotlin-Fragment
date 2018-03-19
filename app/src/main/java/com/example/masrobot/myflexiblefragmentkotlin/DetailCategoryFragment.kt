package com.example.masrobot.myflexiblefragmentkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail_category.view.*
import android.widget.Toast




/**
 * A simple [Fragment] subclass.
 */
class DetailCategoryFragment : Fragment(), View.OnClickListener {

    var EXTRA_NAME = "extra_name"

    var description: String? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_detail_category, container, false)

        view.btn_profile?.setOnClickListener(this)
        view.btn_show_dialog?.setOnClickListener(this)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val categoryName = arguments.getString(EXTRA_NAME)
        view?.tv_category_name?.setText(categoryName)
        view?.tv_category_description?.setText(description)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_profile -> {
            }
            R.id.btn_show_dialog -> {
                val mOptionDialogFragment = OptionDialogFragment()
                mOptionDialogFragment.onOptionDialogListener
            }
        }
    }

}// Required empty public constructor
