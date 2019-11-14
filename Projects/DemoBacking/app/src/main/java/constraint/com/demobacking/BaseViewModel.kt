package constraint.com.demobacking

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseViewModel: ViewModel() {
    internal val disposables by lazy { CompositeDisposable() }

    /**
     * Adds disposable to [CompositeDisposable], which will be cleared automatically when ViewModel is cleared.
     */
    protected fun Disposable.autoDispose() {
        disposables.add(this)
    }

    override fun onCleared() {
        disposables.clear()
        super.onCleared()
    }
}