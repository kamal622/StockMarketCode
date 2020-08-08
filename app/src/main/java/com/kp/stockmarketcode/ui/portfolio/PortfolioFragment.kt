package com.kp.stockmarketcode.ui.portfolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.kp.stockmarketcode.R
import com.kp.stockmarketcode.fragment.PortfolioHoldingPositionFragment
import com.kp.stockmarketcode.fragment.PortfolioMarketWatchFragment
import kotlinx.android.synthetic.main.fragment_fixtures_tabs.view.*

class PortfolioFragment : Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
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
        adapter.addFragment(PortfolioMarketWatchFragment(), "Market Watch")
        adapter.addFragment(PortfolioHoldingPositionFragment(), "Holding Position")
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
    private lateinit var protfolioViewModel: ProtfolioViewModel


    private lateinit var marketWatchList : ArrayList<ProtFolioMW>
    private lateinit var holdingPositionList : ArrayList<ProtFolioHP>

    private lateinit var spExchange : Spinner

    private lateinit var spType:Spinner
    private lateinit var tvFomeDate:TextView
    private lateinit var tvToDate:TextView

    private var MONTHS = arrayOf("JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        protfolioViewModel = ViewModelProvider(this).get(ProtfolioViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_portfolio, container, false)

        /*protfolioViewModel.text.observe(viewLifecycleOwner, Observer {
            tv.text = it
        })*/

        val tvMW = root.findViewById<TextView>(R.id.tvMW)
        val tvHP = root.findViewById<TextView>(R.id.tvHP)

        spType = root.findViewById(R.id.spType)
        tvFomeDate = root.findViewById(R.id.tvFomrDate)
        tvToDate = root.findViewById(R.id.tvToDate)

        val btAdd = root.findViewById<TextView>(R.id.btAdd)
        val rvList = root.findViewById<RecyclerView>(R.id.rvList)
        spExchange = root.findViewById(R.id.spExchange)

        var aa = ArrayAdapter(root.context, android.R.layout.simple_spinner_item, arrayOf("NSE","BSE"))
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        var aaa = ArrayAdapter(root.context, android.R.layout.simple_spinner_item, arrayOf("ALL","F&O",""))
        aaa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        tvFomeDate.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)
            val dpd = DatePickerDialog(root.context, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in textbox
                tvFomeDate.setText("" + dayOfMonth + " " + MONTHS[monthOfYear] + ", " + year)
                Log.d("mmonthOfYear :","" + dayOfMonth + " " + MONTHS[monthOfYear] + ", " + year)
            }, year, month, day)
            dpd.show()
        }

        tvToDate.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)
            val dpd = DatePickerDialog(root.context, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in textbox
                tvToDate.setText("" + dayOfMonth + " " + MONTHS[monthOfYear] + ", " + year)
                Log.d("mmonthOfYear :","" + dayOfMonth + " " + MONTHS[monthOfYear] + ", " + year)
            }, year, month, day)
            dpd.show()
        }

        with(spExchange)
        {
            adapter = aa
            setSelection(0, false)
            //onItemSelectedListener = root.context
            prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        with(spType){
            adapter = aaa
            setSelection(0, false)
            //onItemSelectedListener = root.context
            prompt = "Select your favourite language"
            gravity = Gravity.CENTER
        }

        tvMW.setOnClickListener {
            llMW.visibility = View.VISIBLE
            llHP.visibility = View.GONE
            btAdd.text = "Add"

            tvMW.setBackgroundResource(R.drawable.btn_selected)
            //tvMW.setTextColor(R.color.colorAccent)
            tvMW.typeface = Typeface.DEFAULT_BOLD

            /*
            tvHP.setBackgroundResource(R.color.colorAccent)
            tvHP.setTextColor()*/

        }

        tvHP.setOnClickListener {
            llMW.visibility = View.GONE
            llHP.visibility = View.VISIBLE
            btAdd.text = "Submit"

            tvMW.setBackgroundResource(R.drawable.btn_unselected)
            //tvMW.setTextColor(R.color.black)
            //tvMW.typeface = Typeface.NORMAL
        }

        btAdd.setOnClickListener {
            Toast.makeText(context, "Clicked "+btAdd.text, Toast.LENGTH_LONG).show()

            if(btAdd.text.equals("Add")){

            }else if(btAdd.text.equals("Submit")){


            }

        }

        return root
    }


    fun tabClick(tv:TextView){

    }


    fun setMarketWatchAdapter(){
        rvList.apply {

        }
    }

    fun setHoldingPositionAdapter(){
        rvList.apply {

        }
    }

 */