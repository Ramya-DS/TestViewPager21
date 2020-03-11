package com.example.testviewpager21


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment


/**
 * A simple [Fragment] subclass.
 */
class CardFragment : Fragment() {

    companion object {
        private const val ARG_COUNT = "param1"
        fun newInstance(counter: Int?): CardFragment? {
            val fragment = CardFragment()
            val args = Bundle()
            args.putInt(ARG_COUNT, counter!!)
            fragment.arguments = args
            return fragment
        }

        private val COLOR_MAP = intArrayOf(
            R.color.red_100,
            R.color.red_300,
            R.color.red_500,
            R.color.red_700,
            R.color.blue_100,
            R.color.blue_300,
            R.color.blue_500,
            R.color.blue_700,
            R.color.green_100,
            R.color.green_300,
            R.color.green_500,
            R.color.green_700
        )
    }

    private var counter: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            counter = arguments!!.getInt(ARG_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(ContextCompat.getColor(context!!, COLOR_MAP[counter!!]))
        val textViewCounter = view.findViewById<TextView>(R.id.tv_counter)
        textViewCounter.text = "Fragment No $counter"
    }


}
