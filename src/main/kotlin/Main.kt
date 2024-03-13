import kotlin.random.Random

fun main() {
    var m = Array(4){Array<Int>(4){(1..9).random()}}
    var sumaFilas = Array(m.size){0}
    var sumaColum = Array(m[0].size){0}


    imprimirMatriz(m)

    println("La suma de las filas es")
    println(sumarFilas(m, sumaFilas))
    println("La suma de las columnas es")
    println(sumarColumnas(m, sumaColum))
}

private fun imprimirMatriz(m: Array<Array<Int>>) {
    for (f in m.indices) {
        for (c in m[f].indices) {
            print("${m[f][c]} ")
        }
        println()
    }
}

private fun sumarColumnas(m:Array<Array<Int>>, sumaColumnas:Array<Int>): Int {
    var f: Int = 0
    var c: Int = 0

    while (c < m.size){
        while (f < m[0].size){
            sumaColumnas[c] += m[f][c]
            f++
        }
        f = 0
        c++
    }
    return sumaColumnas[c]
}

private fun sumarFilas(m: Array<Array<Int>>, sumaFilas: Array<Int>): Int {
    var f: Int = 0
    var c: Int = 0

    while (f < m.size) {
        while (c < m[0].size) {
            sumaFilas[f] += m[f][c]
            c++
        }
        c = 0
        f++
    }
    return sumaFilas[f]
}