package gulati.ankush.androiddemos.ui.main.advanced

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import gulati.ankush.androiddemos.BR
import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.models.TopicData
import gulati.ankush.androiddemos.ui.main.OnTopicClickListener
import me.tatarka.bindingcollectionadapter2.ItemBinding

class AdvancedViewModel : ViewModel(), OnTopicClickListener {
    val topicsList: MutableList<TopicData> = mutableListOf<TopicData>()
    val topicClickEvent = MutableLiveData<TopicData>()// TODO SingleLiveEvent<String>()

    fun initList() {
        val topic1:TopicData = TopicData("Notifications", "1.1 Using Android Notifications \n1.2 Android Firebase Cloud Messaging")
        val topic2:TopicData = TopicData("Advanced Graphics", "2.1 Creating Custom Views\n" +
                "2.2 Drawing on Canvas Objects\n" +
                "2.3 Clipping Canvas Objects\n" +
                "2.4 Creating Effects with Shaders")
        val topic3:TopicData = TopicData("Notifications2", "FCM and in-app")

        topicsList.add(topic1)
        topicsList.add(topic2)
        topicsList.add(topic3)
    }

    override fun onItemClick(topicData: TopicData) {
        topicClickEvent.value = topicData
    }


    /**
     * The Single item.
     */
    val accessoryBinding = ItemBinding.of<TopicData> { itemBinding, _, _ ->
        itemBinding.set(BR.topic, R.layout.layout_item_topics)
            .bindExtra(BR.listener, this)
    }
}