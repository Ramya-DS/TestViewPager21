package com.example.testviewpager21

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(var fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    companion object{
        const val SIZE=10
    }
    override fun getItemCount() = SIZE


    override fun createFragment(position: Int) = CardFragment.newInstance(position)!!
}