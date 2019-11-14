package constraint.com.demobacking

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import constraint.com.demobacking.binding.bind
import constraint.com.demobacking.model.Feed


class FeedViewState(
    initFeed: Feed = Feed.EMPTY
): BaseObservable(){


    private val noOfLikes by bind(BR.displayNoOfLikes, initFeed.noOfLikes)

    @get:Bindable
    val displayNoOfLikes
        get() = noOfLikes.toString()
}