class Animal {
  void walk() {
    print('$runtimeType walk!');
  }
}

class Carnivore extends Animal {
  void eat() {
    print('$runtimeType eat!');
  }
}

class Cat extends Carnivore {}
