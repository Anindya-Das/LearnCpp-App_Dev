package com.testapp.learnc


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton


/**
 * A simple [Fragment] subclass.
 */
class LoopsFragment : Fragment() {

    var btn1: ImageButton?=null


    var prev_pg:Fragment?=null



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        var view:View
        view = inflater!!.inflate(R.layout.fragment_loops,container,false)
        btn1=view.findViewById(R.id.prev_pg)

        btn1?.setOnClickListener({
            prev_pg = ConditionalFragment()
            var ch = fragmentManager.beginTransaction()
            ch.replace(R.id.screen_area,prev_pg)
            ch.addToBackStack(null)
            ch.commit()
        })



        return view
    }

}// Required empty public constructor
