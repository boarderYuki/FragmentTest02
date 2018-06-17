package io.indexpath.pragmenttest02

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * pragmentTest02
 *
 * Created by yuki on 2018. 6. 17.
 */

class MyFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.myfragment, container, false)

        return view
    }
}