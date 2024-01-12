package com.example.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPage2Adapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> return Fragment1()
            1 -> return Fragment2()
            2 -> return Fragment3()
        }
        return Fragment()
    }

}


















//class CollectionDemoFragment : Fragment() {
//    private lateinit var demoCollectionAdapter: DemoCollectionAdapter
//    private lateinit var viewPager: ViewPager2
//    private lateinit var tabLayout: TabLayout
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
//        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
//            tab.text = "OBJECT ${(position + 1)}"
//        }.attach()
//    }
//
//}
//class DemoCollectionAdapter(fragment : Fragment) : FragmentStateAdapter(fragment){
//    override fun getItemCount(): Int {
//        return 100
//    }
//    override fun createFragment(position: Int): Fragment {
//        val fragment = DemoObjectFragment()
//        fragment.arguments = Bundle().apply {
//            putInt("xung", 40)
//        }
//        return fragment
//    }
//}

//class DemoObjectFragment : Fragment() {
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        val tv : TextView = view.findViewById(android.R.id.text1)
//        tv.text = "Xung"
//    }
//}