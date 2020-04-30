## Compile time polymorphism

Compile time polymorphism adalah sebuah proses di mana sebuah method atau fungsi dipanggil saat kompilasi. Ini dapat terjadi karena sebuah konsep bernama method overloading. Method **overloading** merupakan kondisi di mana kita bisa membuat 2 (dua) atau lebih fungsi yang memiliki jumlah, tipe, dan urutan parameter yang berbeda di dalam sebuah class. 

```kotlin
class Arithmetic {
  fun add(valueA: Int, valueB: Int) = valueA + valueB
  fun add(valueA: Long, valueB: Long) = valueA + valueB
  fun add(valueA: Int, valueB: Long) = valueA + valueB
  fun add(valueA: Long, valueB: Int) = valueA + valueB
}

```

## Runtime Polymorphism
Berbeda dengan compile time polymorphism yang memanggil fungsi ketika proses kompilasi, runtime polymorphism adalah proses di mana sebuah fungsi dipanggil pada saat runtime. Contoh dari runtime polymorphism adalah method **overriding**, yaitu sebuah kelas yang memiliki fungsi dengan nama sama dengan fungsi yang di dalam kelas induknya.

Lantas kenapa method overriding dipanggil saat runtime? Jawabannya, ketika proses kompilasi berlangsung, kompiler tidak tahu fungsi mana yang dipanggil. Apakah yang berada pada sub class atau parent class-nya? Keduanya punya nama yang sama. Sehingga, JVM (Java Virtual Machine)-lah yang akan berperan menentukan fungsi mana yang akan dipanggil ketika runtime.

```kotlin
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
```
