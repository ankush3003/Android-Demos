package gulati.ankush.androiddemos.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.ui.main.advanced.AdvancedFragment
import gulati.ankush.androiddemos.ui.main.basics.BasicsFragment

private val TAB_TITLES = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        val fragment: Fragment
        if(position == 0){
            fragment = AdvancedFragment()
        } else {
            fragment = BasicsFragment()
        }
        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}