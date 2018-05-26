package com.testapp.learnc

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

/**
 * Created by HP on 28-12-2017.
 */
class BasicFile:Fragment() {

    var imgBtn:ImageButton?=null
    var goto_hw:Fragment?=null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view:View
        view = inflater!!.inflate(R.layout.basic_syn,container,false)
        imgBtn=view.findViewById<ImageButton>(R.id.bs_syc_goto_next)

        imgBtn?.setOnClickListener({
            goto_hw = HelloWorldFragment()
            var change = fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,goto_hw)
            change.addToBackStack(null)
            change.commit()
        })

        return view
    }
}


