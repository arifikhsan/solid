open class Animal {
  open fun walk() {
    println("${javaClass.simpleName} walk!")
  }
}

class Cat : Animal() {
  override fun walk() {
    println("Yeay! ${javaClass.simpleName} walked!")
  }
}
