import kotlin.math.pow

fun main(){

    //Exercicio numero 01
    /*
    println ("Digite um numero: ")
    val num1 = readLine()!!.toInt()
    println ("Digite um segundo numero: ")
    val num2 = readLine()!!.toInt()
    println ("Digite um terceiro  numero: ")
    val num3 = readLine()!!.toInt()

   if (num1 > num2 && num1 > num3){

       println("O maior numero é: $num1")


   }else if (num2 > num3){

       println("O Maior numero é: $num2")
   }else {

       println("O maior numero é: $num3")
   }*/

    //Exercicio numero 02

    println("Digite um numero: ")
    val x1 = readLine()!!.toInt()

    println("Digite um segundo numero: ")
    val x2 = readLine()!!.toInt()

    println("Digite um terceiro numero: ")
    val x3 = readLine()!!.toInt()


    if (x1 <= x2 && x2 <= x3){

        println("Os numeros em ordem crecente são: $x1, $x2, $x3")

    }else if (x2 <= x1 && x1 <= x3){

                println("Os numero em ordem crescente são: $x2, $x1, $x3")

            }else if (x3 <= x1 && x2 <= x1) {

                println("Os numero em ordem crecente são: $x3, $x2, $x1")

            } else if (x3 <= x1 && x1 <= x2){

               println("Os numero em ordem crecente são: $x3, $x1, $x2")

            }else if (x1 <= x3 && x3 <= x2 ){

                 println("Os numero em ordem crecente são: $x1, $x3, $x2")

            }else  {

               println("Os numero em ordem crecente são: $x2, $x3, $x1")

            }

        }

         //Exercicio 03
/*
    println("Digite aqui sua idade: ")
    val idade = readLine()!!.toInt()

    when (idade) {
        in 0 .. 9 -> println("Você ainda não tem idade para nenhuma das categorias!")
        in 10 ..14 -> println("Sua categoria é o Infantil")
        in 15..17  -> println("Sua categoria é Juvenil")
        in 18..100 -> println("Sua categoria é adulto")
*/

    //Exercicio 05
/*
    print("Digite um numero de 1 a 12 para saber o mês: ")
    val mes = readLine()!!.toInt()


    when(mes) {

         1 -> println("Janeiro")
         2 -> println("Fevereiro")
         3 -> println("Março")
         4 -> println("Abril")
         5 -> println("Maio")
         6 -> println("Junho")
         7 -> println("Julho")
         8 -> println("Agosto")
         9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")

        else -> println("Numero Invalido")


    }
*/
    /*

    //Exercicio 4

    print("Digite um numero aqui: ")
    var num = readLine()!!.toInt()

    if (num  % 2 == 0){

        var raiz = 0.0
        raiz = Math.sqrt(num.toDouble())

        println("Esse numero é par. E a raiz quadrada é: $raiz ")


    }else{
        var quad = 0
        quad = num*num
        println("Esse numero é impar. E ele elevado ao quadrado é: $quad")
    }
    *?
     */































