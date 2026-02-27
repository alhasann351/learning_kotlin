

sealed class Res {
    data class Success (val data: String) : Res()
    data class Error (val message: String) : Res()
    object Loading : Res()
}

fun progressResult (res : Res) {
    when (res) {
        is Res.Error -> println(res.message)
        Res.Loading -> println("Loading...")
        is Res.Success -> println(res.data)
    }
}

fun main () {
    val success = Res.Success("Success")
    val error = Res.Error("Error")
    val loading = Res.Loading

    progressResult(loading)
    progressResult(success)
    progressResult(error)
}