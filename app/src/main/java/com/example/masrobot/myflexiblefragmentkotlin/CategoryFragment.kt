package com.example.masrobot.myflexiblefragmentkotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_category.view.*


/**
 * A simple [Fragment] subclass.
 */
class CategoryFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_category, container, false)
        view.btn_detail_category?.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_detail_category) {
            val mDetailCategoryFragment = DetailCategoryFragment()
            val mBundle = Bundle()
            mBundle.putString(mDetailCategoryFragment.EXTRA_NAME, "Lifestyle")
            val description = "Kategori ini akan berisi produk-produk lifestyle"
            mDetailCategoryFragment.arguments = mBundle
            mDetailCategoryFragment.description = description

            val mFragmentManager = fragmentManager
            val mFragmentTransaction = mFragmentManager.beginTransaction()
            mFragmentTransaction.replace(R.id.frame_container, mDetailCategoryFragment,
                    DetailCategoryFragment::class.java.simpleName)
            mFragmentTransaction.addToBackStack(null)
            mFragmentTransaction.commit()
        }
    }

}// Required empty public constructor
