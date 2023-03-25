class Pessoa constructor(private val _nome : String) {
    fun cumprimentar() : String {
        return "Olá $_nome, tudo bem?"
    }
    val nome get() = _nome
}
open class Animal(protected val nome: String){
    open fun mensagem(): String {
        return "O $nome nao tem acao";
    }
}
class Canideo (nome: String) : Animal(nome){
    override fun mensagem(): String {
        return "O $nome está a latir";
    }
}
class Gato (nome: String) : Animal(nome){
    override fun mensagem(): String {
        return "O $nome está a miar";
    }
}
class Ave (nome: String) : Animal(nome){
    override fun mensagem(): String {
        return "A $nome está a voar";
    }
}
fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6,7,8,9,10)
    val impares =  numbers.filter{ num -> num % 2 != 0}
    println(numbers)
    println(impares)
    val pessoa1 = Pessoa("Tiago")
    val pessoa2 = Pessoa("João")
    val pessoa3 = Pessoa("Vasco")
    val pessoa4 = Pessoa("Diogo")
    val pessoa5 = Pessoa("Rodrigo")
    println(pessoa1.cumprimentar())
    val pessoas : MutableList<Pessoa?> = mutableListOf(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5)
    pessoas.forEach{println(it!!.cumprimentar())}
    val randomIndex = (0..pessoas.size).random()
    pessoas.add(randomIndex,null)
    pessoas.add(randomIndex,null)
    pessoas.forEach {
        val nome = it?.nome ?: "Anonimo"
        println(nome)
      }
    pessoas.forEachIndexed { index, pessoa -> if (pessoa == null ) println("$index: Olá Anónimo, tudo bem?") else println("$index: " + pessoa.cumprimentar())}
    val canideo = Canideo("Canivetes")
    val falcao = Animal("ViaRapida")
    val lobo = Animal("Scott")
    val canario = Animal("Teddy")
    val gato = Gato("Barretas")
    val cao = Animal("Chili")
    val ave = Ave("BenficaMerda")
    val animais : MutableList<Animal?> = mutableListOf(canideo,falcao,lobo,canario,gato,cao,ave)
    animais.forEach {println(it!!.mensagem())}
}