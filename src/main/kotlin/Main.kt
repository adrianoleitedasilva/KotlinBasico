const val sobrenome = "Silva"
val nome = "Adriano"

fun main(args: Array<String>) {

    // DECLARANDO VARIÁVEIS
    // Val é usado para valores imutáveis
    // Já o var para valores mutáveis
    // val nome: String = "Adriano"
    println("1 - Declarando variáveis e constantes")
    println("---------------------------------")
    println(nome)
    println(sobrenome)
    println("---------------------------------")

    // OPERADORES ARITMÉTICOS
    println("2 - Operadores aritméticos")
    println("---------------------------------")
    val numero1 = 11
    val numero2 = 2

    // Calculando o resultado
    var resultado = numero1 + numero2
    println("O resultado da Soma é de: " + resultado)

    resultado = numero1 - numero2
    println("O resultado da Subtração é de: " +resultado)

    resultado = numero1 * numero2
    println("O resultado da Multiplicação é de: " + resultado)

    resultado = numero1 / numero2
    println("O resultado da Divisão é de: " + resultado)

    resultado = numero1 % numero2
    println("A sobra da Divisão é de: " + resultado)
    println("---------------------------------")

    // OPERADORES RELACIONAIS E LÓGICOS
    println("Operadores Relacionais e Lógicos")
    println("---------------------------------")

    /*
        OS SÍMBOLOS E OPERAÇÕES QUE TEMOS:

         > que representa maior que
         < que representa menor que
         >= que representa maior ou igual
         <= que representa menor ou igual
         == que representa igualdade
         != que representa diferença
    */
    print("numero1 > numero2: ")
    print(numero1 > numero2)
    println()
    print("numero1 < numero2: ")
    print(numero1 < numero2)
    println()
    print("numero1 >= numero2: ")
    print(numero1 >=  numero2)
    println()
    print("numero1 <= numero2: ")
    print(numero1 <=  numero2)
    println()
    print("numero1 == numero2: ")
    print(numero1 ==  numero2)
    println()
    print("numero1 != numero2: ")
    print(numero1 !=  numero2)
    println()
    val sobrenome2 = "Araújo"
    print("sobrenome é igual a sobrenome2? ")
    print(sobrenome == sobrenome2)
}
