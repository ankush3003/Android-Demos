package gulati.ankush.androiddemos.ui.main.advanced.notifications.ui

import android.app.NotificationChannel
import android.app.NotificationManager
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders

import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.databinding.FragmentEggTimerBinding

class EggTimerFragment : Fragment() {

    private val TOPIC = "breakfast"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentEggTimerBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_egg_timer, container, false
        )

        val viewModel = ViewModelProviders.of(this).get(EggTimerViewModel::class.java)

        binding.eggTimerViewModel = viewModel
        binding.lifecycleOwner = this.viewLifecycleOwner

        // TODO: Step 1.7 call create channel

        return binding.root
    }

    private fun createChannel(channelId: String, channelName: String) {
        // TODO: Step 1.6 START create a channel

        // TODO: Step 1.6 END create a channel

    }

    companion object {
        fun newInstance() = EggTimerFragment()
    }
}
