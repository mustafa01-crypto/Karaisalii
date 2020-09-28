package com.techno.karaisalgezirehberi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_giris_place.*


class GirisPlace : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_giris_place, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonFirst.setOnClickListener {
            val action=GirisPlaceDirections.actionGirisPlaceToFirstPlace()
            Navigation.findNavController(it).navigate(action)
        }
        buttonSecond.setOnClickListener {
            val action=GirisPlaceDirections.actionGirisPlaceToSecondPlace()
            Navigation.findNavController(it).navigate(action)
        }
        buttonThird.setOnClickListener {
            val action=GirisPlaceDirections.actionGirisPlaceToThirdPlace()
            Navigation.findNavController(it).navigate(action)
        }
        buttonFourth.setOnClickListener {
            val action=GirisPlaceDirections.actionGirisPlaceToFourthPlace()
            Navigation.findNavController(it).navigate(action)
        }
        buttonFifth.setOnClickListener {
            val action=GirisPlaceDirections.actionGirisPlaceToFifthPlace()
            Navigation.findNavController(it).navigate(action)
        }
    }


}