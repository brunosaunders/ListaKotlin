package br.digital.com.aulakotlinsemobjeto


fun main() {
    showTheFirst100PositiveNumbers()
    maiorNumero(4,5,3)
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
print(maiorNumero(2,4,7))
}


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