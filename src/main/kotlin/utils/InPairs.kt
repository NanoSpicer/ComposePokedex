package utils



fun <T> List<T>.inPairs(): List<Pair<T, T?>> {
    val out = mutableListOf<Pair<T, T?>>()
    for (i in indices step 2) {
        val nextIndex = i+1
        out.add(Pair(this[i], this.getOrNull(nextIndex)))
    }
    return out
}
