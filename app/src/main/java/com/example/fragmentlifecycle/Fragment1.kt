package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragment1 : Fragment(R.layout.fragment_1) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("Fragment1","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Fragment1","onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Fragment1","onCreateView")
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("Fragment1","onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Fragment1","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Fragment1","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Fragment1","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Fragment1","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("Fragment1","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Fragment1","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("Fragment1","onDetach")
    }

}