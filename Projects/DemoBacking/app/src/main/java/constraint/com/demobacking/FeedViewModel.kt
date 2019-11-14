package constraint.com.demobacking

import javax.inject.Inject

class FeedViewModel @Inject constructor() :BaseViewModel() {

    val viewState = FeedViewState()
}