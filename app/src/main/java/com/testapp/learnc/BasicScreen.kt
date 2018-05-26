package com.testapp.learnc

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView



class BasicScreen :Fragment() {

    var act_opt1:TextView?=null
    var act_opt2:TextView?=null
    var act_opt3:TextView?=null
    var act_opt4:TextView?=null
    var act_opt5:TextView?=null
    var act_opt6:TextView?=null
    var act_opt7:TextView?=null

    var bs_frag:Fragment?=null
    var hw_frag:Fragment?=null
    var comm_frag:Fragment?=null
    var data_frag:Fragment?=null
    var operator_frag:Fragment?=null
    var cond_frag:Fragment?=null
    var loop_frag:Fragment?=null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view: View
        view = inflater!!.inflate(R.layout.bascic_screen,container,false)
        act_opt1=view.findViewById(R.id.opt1)
        act_opt2=view.findViewById(R.id.opt2)
        act_opt3=view.findViewById(R.id.opt3)
        act_opt4=view.findViewById(R.id.opt4)
        act_opt5=view.findViewById(R.id.opt5)
        act_opt6=view.findViewById(R.id.opt6)
        act_opt7=view.findViewById(R.id.opt7)


        act_opt1?.setOnClickListener ({
            bs_frag = BasicFile()
            val change = fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,bs_frag)
            change.addToBackStack(bs_frag.toString())
            change.commit()
        })

        act_opt2?.setOnClickListener({
            hw_frag = HelloWorldFragment()
            val change = fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,hw_frag)
            change.addToBackStack(hw_frag.toString())
            change.commit()
        })

        act_opt3?.setOnClickListener({
          comm_frag = CommentFragment()
            val change=fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,comm_frag)
            change.addToBackStack(comm_frag.toString())
            change.commit()
        })

        act_opt4?.setOnClickListener({
            data_frag = DataTypeFragment()
            val change=fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,data_frag)
            change.addToBackStack(data_frag.toString())
            change.commit()
        })

        act_opt5?.setOnClickListener({
            operator_frag = OperatorFragment()
            val change=fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,operator_frag)
            change.addToBackStack(operator_frag.toString())
            change.commit()
        })

        act_opt6?.setOnClickListener({
             cond_frag = ConditionalFragment()
            val change=fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,cond_frag)
            change.addToBackStack(cond_frag.toString())
            change.commit()
        })

        act_opt7?.setOnClickListener({
            loop_frag = LoopsFragment()
            val change=fragmentManager.beginTransaction()
            change.replace(R.id.screen_area,loop_frag)
            change.addToBackStack(loop_frag.toString())
            change.commit()
        })


        return view

    }

}