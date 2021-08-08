package viewmodel

import datasource.PokeRepo
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


class PokeViewModel {

    val pokemon =
        flow {
            val pokes = PokeRepo.getPokemon()
            emit(pokes)
        }
        .conflate()
        .catch { System.err.println(it.message) }
        .flowOn(Dispatchers.IO)

}