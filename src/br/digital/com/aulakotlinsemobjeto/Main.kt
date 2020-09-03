package br.digital.com.aulakotlinsemobjeto


fun main() {
    showTheFirst100PositiveNumbers()
    maiorNumero(4,5,3) // Italo J.
    exercicio4() // Victor Rubens
    
    //exercicio 3 - Thamires Oliveira
    println(par(2))
    println(par(3))
}

//Exercício 6 - Bruno
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
//Exercicio 1 - Italo J.
fun maiorNumero(numeroA:Int, numeroB:Int, numeroC:Int): Int{
    var aux:Int

    aux = if(numeroA>=numeroB && numeroA>=numeroC){
        numeroA
    } else if(numeroB>=numeroA && numeroB>=numeroC) {
        numeroB
    } else{
        numeroC
    }
    print(aux)
}
//Exercício 3 - Thamires Oliveira
fun par(num: Int): Boolean {
    return (num % 2 == 0)
}
