/*
  Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
  Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
  NO hace falta comprobar que ambas palabras existan.
  Dos palabras exactamente iguales no son anagrama.
*/

fun checkAnagram(first: String, second: String): Boolean{
  if (first.length == second.length && first != second){
    val base1 = first.lowercase().toCharArray().sorted().joinToString("")
    val base2 = second.lowercase().toCharArray().sorted().joinToString("")
    return base1 == base2
  }
  else return false
}

fun main(){
    println(checkAnagram("Silent", "Listen"))
}