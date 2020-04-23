package gulati.ankush.androiddemos.ui.main.advanced.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.ui.main.advanced.notifications.ui.EggTimerFragment

class NotificationMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, EggTimerFragment.newInstance())
                .commitNow()
        }
    }
}
