package com.kp.stockmarketcode.ui.trade

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.trade.TradeEquit
import com.kp.stockmarketcode.trade.TradeFund
import com.kp.stockmarketcode.trade.TradeFandO
import kotlinx.android.synthetic.main.fragment_fixtures_tabs.view.*

class TradeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
        //(activity as AppCompatActivity).supportActionBar?.hide()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fixtures_tabs, container, false)
        setupViewPager(view.viewpager)
        view.result_tabs.setupWithViewPager(view.viewpager)
        return view
    }

    // Add Fragments to Tabs
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = Adapter(childFragmentManager)
        adapter.addFragment(TradeEquit(), "Equit")
        adapter.addFragment(TradeFandO(), "F&O")
        adapter.addFragment(TradeFund(), "Fund")
        viewPager.adapter = adapter
    }

    internal class Adapter(manager: FragmentManager?) :
        FragmentPagerAdapter(manager!!,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val mFragmentList: MutableList<Fragment> = java.util.ArrayList()
        private val mFragmentTitleList: MutableList<String> = java.util.ArrayList()

        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mFragmentTitleList[position]
        }
    }


}

/*

  private lateinit var tradeViewModel: TradeViewModel

    //private var expandableListView: ExpandableListView? = null
    private var adapter: ExpandableListAdapter? = null
    private var titleList: List<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tradeViewModel = ViewModelProvider(this).get(TradeViewModel::class.java)
        val view = inflater.inflate(R.layout.fragment_trade, container, false)
        tradeViewModel.text.observe(viewLifecycleOwner, Observer {
            tv.text = it
        })


        if (view.expendableList != null) {
            val listData = data
            titleList = ArrayList(listData.keys)
            adapter = CustomExpandableListAdapter(view.context, titleList as ArrayList<String>, listData)
            view.expendableList!!.setAdapter(adapter)
            view.expendableList!!.setOnGroupExpandListener { groupPosition ->
                Toast.makeText(
                    context,
                    (titleList as ArrayList<String>)[groupPosition] + " List Expanded.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            view.expendableList!!.setOnGroupCollapseListener { groupPosition ->
                Toast.makeText(
                    context,
                    (titleList as ArrayList<String>)[groupPosition] + " List Collapsed.",
                    Toast.LENGTH_SHORT
                ).show()
            }
            view.expendableList!!.setOnChildClickListener { _, _, groupPosition, childPosition, _ ->
                Toast.makeText(
                    context,
                    "Clicked: " + (titleList as ArrayList<String>)[groupPosition] + " -> " + listData[(
                            titleList as
                                    ArrayList<String>
                            )
                            [groupPosition]]!!.get(
                        childPosition
                    ),
                    Toast.LENGTH_SHORT
                ).show()
                false
            }
        }



        return view
    }

    */