package constraint.com.demobacking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import constraint.com.demobacking.FeedItemBinding.inflate
import dagger.android.support.DaggerFragment
import javax.inject.Inject
class FeedFragment: DaggerFragment() {


    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflate(inflater, container, false)
            .apply {
                val vm: FeedViewModel by viewModels { factory }
                viewModel = vm
                viewState = vm.viewState
            }
            .root
    }
}