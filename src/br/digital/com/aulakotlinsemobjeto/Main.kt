package br.digital.com.aulakotlinsemobjeto


fun main() {
    showTheFirst100PositiveNumbers()

    exercicio4() // Victor Rubens
}

fun showTheFirst100PositiveNumbers() {
    for (item in 1..100) {
        println(item)
    }
}

// Victor Rubens
fun exercicio4() {
    print("Exercício 4: Os primeiros 100 números inteiros positivos ímpares: ")
    var i = 1
    while (i <= 200) {
        if (i % 2 != 0)
            print("$i,")
        i++
    }
}