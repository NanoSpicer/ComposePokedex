package utils


fun <T> List<T>.inPairs(): List<Pair<T?, T?>> {
    if(isEmpty()) return emptyList()
    val res = mutableListOf<Pair<T?, T?>>()

    for (i in 0..size) {
        val first = getOrNull(i)
        val second = getOrNull(i+1)
        res.add(first to second)
    }

    return res.toList()
}