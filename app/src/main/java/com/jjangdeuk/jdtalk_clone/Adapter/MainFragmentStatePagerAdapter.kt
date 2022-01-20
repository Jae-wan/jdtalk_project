package com.jjangdeuk.jdtalk_clone.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.jjangdeuk.jdtalk_clone.Fragment.*

class MainFragmentStatePagerAdapter(fm : FragmentManager, val fragmentCount : Int) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position : Int): Fragment? {
        when(position) {
            0 -> return FriendsFragment()
            1 -> return ChatFragment()
            2 -> return Other_Fragment()
            else -> return FriendsFragment()
        }
    }

    override fun getCount(): Int = fragmentCount

}