fun main() {
  val cat = Cat()
  cat.walk()
}

open class Animal {
  open fun walk() {
    println("${javaClass.simpleName} walk!")
  }
}

class Cat : Animal(){
  override fun walk() {
    super.walk()
    println("Yeay! ${javaClass.simpleName} walked!")
  }
}
