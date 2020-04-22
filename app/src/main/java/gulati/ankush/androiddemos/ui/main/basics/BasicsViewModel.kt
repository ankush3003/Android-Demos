package gulati.ankush.androiddemos.ui.main.basics

import androidx.lifecycle.ViewModel
import gulati.ankush.androiddemos.BR
import gulati.ankush.androiddemos.R
import gulati.ankush.androiddemos.models.TopicData
import me.tatarka.bindingcollectionadapter2.ItemBinding

class BasicsViewModel : ViewModel() {
    val dummyText = "This is dummy"
    val topicsList: MutableList<TopicData> = mutableListOf<TopicData>()

    fun initList() {
        val topic1:TopicData = TopicData("Lifecycle Aware Components", "ViewModel, LifecycleOwner and LiveData")
        val topic2:TopicData = TopicData("Lifecycle Aware Components", "ViewModel, LifecycleOwner and LiveData")
        val topic3:TopicData = TopicData("Lifecycle Aware Components", "ViewModel, LifecycleOwner and LiveData")

        topicsList.add(topic1)
        topicsList.add(topic2)
        topicsList.add(topic3)
    }

    /**
     * The Single item.
     */
    val accessoryBinding = ItemBinding.of<TopicData> { itemBinding, _, _ ->
        itemBinding.set(BR.itemViewModel, R.layout.layout_item_topics)
    }
}