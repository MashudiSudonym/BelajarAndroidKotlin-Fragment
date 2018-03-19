package com.example.masrobot.myflexiblefragmentkotlin


import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.masrobot.myflexiblefragmentkotlin.OptionDialogFragment.OnOptionDialogListener
import kotlinx.android.synthetic.main.fragment_option_dialog.*
import kotlinx.android.synthetic.main.fragment_option_dialog.view.*


/**
 * A simple [Fragment] subclass.
 */
class OptionDialogFragment : DialogFragment(), View.OnClickListener {

    var onOptionDialogListener: OnOptionDialogListener? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_option_dialog, container, false)

        view.btn_choose?.setOnClickListener(this)
        view.btn_close?.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_close -> {
                dialog.cancel()
            }
            R.id.btn_choose -> {
                val checkedRadioButtonId = rg_options.checkedRadioButtonId

                if (checkedRadioButtonId != -1) {
                    var coach: String? = null
                    when (checkedRadioButtonId) {
                        R.id.rb_saf -> coach = rb_saf.text.toString().trim()
                        R.id.rb_mou -> coach = rb_mou.text.toString().trim()
                        R.id.rb_lvg -> coach = rb_lvg.text.toString().trim()
                        R.id.rb_moyes -> coach = rb_moyes.text.toString().trim()
                    }
                    onOptionDialogListener?.onOptionChoosen(coach)
                    dialog.cancel()
                }
            }
        }
    }

    interface OnOptionDialogListener {
        fun onOptionChoosen(text: String?)
    }

}// Required empty public constructor
