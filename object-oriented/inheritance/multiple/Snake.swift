protocol Ovipar {

}

protocol Vivipar {

}

protocol Ovovivipar : Ovipar, Vivipar {

}

class Snake : Ovovivipar {

}
