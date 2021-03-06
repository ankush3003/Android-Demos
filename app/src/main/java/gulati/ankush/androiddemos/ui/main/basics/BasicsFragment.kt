package gulati.ankush.androiddemos.ui.main.basics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer

import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.databinding.FragmentBasicsBinding
import org.koin.android.viewmodel.ext.android.viewModel

class BasicsFragment : Fragment() {

    private val basicsViewModel: BasicsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val mainBinding : FragmentBasicsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_basics, container, false)

        mainBinding.viewmodel = basicsViewModel
        basicsViewModel.initList()
        mainBinding.lifecycleOwner = this
        mainBinding.executePendingBindings()
        initViews()

        return mainBinding.root
    }

    private fun initViews() {
        basicsViewModel.topicClickEvent.observe(viewLifecycleOwner, Observer {
            Toast.makeText(activity, "Clicked: " + it.headerText, Toast.LENGTH_SHORT).show()
        })
    }
}
