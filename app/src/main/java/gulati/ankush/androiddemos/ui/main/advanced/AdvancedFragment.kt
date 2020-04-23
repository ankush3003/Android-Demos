package gulati.ankush.androiddemos.ui.main.advanced

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer

import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.databinding.FragmentAdvancedBinding
import gulati.ankush.androiddemos.databinding.FragmentBasicsBinding
import gulati.ankush.androiddemos.ui.main.advanced.notifications.NotificationMainActivity
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * Advanced android in Kotlin - https://codelabs.developers.google.com/codelabs/advanced-android-kotlin-training-welcome/#1
 *
 * Advanced Android in Kotlin includes the following lessons:
 * Lesson 1: Notifications
 * Lesson 2: Advanced Graphics
 * Lesson 3: Animation
 * Lesson 4: Geo
 * Lesson 5: Testing and Dependency Injection
 * Lesson 6: Login
 */

class AdvancedFragment : Fragment() {

    private val advancedViewModel: AdvancedViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val mainBinding : FragmentAdvancedBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_advanced, container, false)

        mainBinding.viewmodel = advancedViewModel
        advancedViewModel.initList()
        mainBinding.lifecycleOwner = this
        mainBinding.executePendingBindings()

        initViews()

        return mainBinding.root
    }

    private fun initViews() {
        advancedViewModel.topicClickEvent.observe(viewLifecycleOwner, Observer {
            when(it.headerText) {
                "Notifications" -> {
                    val intent = Intent(activity, NotificationMainActivity::class.java)
                    startActivity(intent)
                }
                else -> Toast.makeText(activity, "Clicked: " + it.headerText, Toast.LENGTH_SHORT).show()
            }
        })
    }
}
