package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Fragment2 : Fragment(R.layout.fragment_2) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment2","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment2","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.i("Fragment2","onCreateView")

        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Fragment2","onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment2","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment2","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment2","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment2","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment2","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment2","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment2","onDetach")
    }

}