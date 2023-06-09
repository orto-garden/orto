package garden.orto.shared.base.executor

import kotlinx.coroutines.CoroutineDispatcher

interface IDispatcher {
    val dispatcher: CoroutineDispatcher
}