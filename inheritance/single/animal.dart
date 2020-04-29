class Animal {
  void walk() {
    print('$runtimeType walk!');
  }
}

class Cat extends Animal {
  @override
  void walk() {
    super.walk();
    print('Yeay! $runtimeType walked!');
  }
}
