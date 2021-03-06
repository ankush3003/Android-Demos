package gulati.ankush.androiddemos.ui.main.basics

//import SingleLiveEvent
import android.content.ClipData.Item
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import gulati.ankush.androiddemos.BR
import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.models.TopicData
import gulati.ankush.androiddemos.ui.main.OnTopicClickListener
import me.tatarka.bindingcollectionadapter2.ItemBinding


class BasicsViewModel : ViewModel(), OnTopicClickListener{
    val topicsList: MutableList<TopicData> = mutableListOf<TopicData>()
    val topicClickEvent = MutableLiveData<TopicData>()// TODO SingleLiveEvent<String>()

    fun initList() {
        val topic1 = TopicData("Lifecycle Aware Components", "ViewModel, LifecycleOwner and LiveData")
        val topic2 = TopicData("Lifecycle Aware Components1", "ViewModel, LifecycleOwner and LiveData")
        val topic3 = TopicData("Lifecycle Aware Components2", "ViewModel, LifecycleOwner and LiveData")

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