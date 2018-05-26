package com.testapp.learnc

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

/**
 * Created by HP on 29-12-2017.
 */
class HelloWorldFragment:Fragment() {

    var btn1:ImageButton?=null
    var btn2:ImageButton?=null

    var prev_pg:Fragment?=null
    var next_pg:Fragment?=null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view:View
        view = inflater!!.inflate(R.layout.hello_world,container,false)
        btn1=view.findViewById(R.id.hwpg_goto_prev)
        btn2=view.findViewById(R.id.hwpg_goto_next)

        btn1?.setOnClickListener({
            prev_pg = BasicFile()
            var ch = fragmentManager.beginTransaction()
            ch.replace(R.id.screen_area,prev_pg)
            ch.addToBackStack(null)
            ch.commit()
        })

        btn2?.setOnClickListener({
            next_pg = CommentFragment()
            var ch = fragmentManager.beginTransaction()
            ch.replace(R.id.screen_area,next_pg)
            ch.addToBackStack(null)
            ch.commit()
        })

        return view
    }


}