class EWalletProvider {
  void accountID() {}
  void walletProviderID() {}
}

class PaymentProvider {
  void paymentName() {}
  void amount() {}
}

class BankProvider {
  void bankID() {}
  void virtualAccount() {}
}

class Gopay implements EWalletProvider, PaymentProvider {
  @override
  void paymentName() {
    // implementation
  }

 @override
  void amount() {
    // implementation
  }

  @override
  void accountID() {
    // implementation
  }
  @override
  void walletProviderID() {
    // implementation
  }
}

class Mandiri implements BankProvider, PaymentProvider {
  @override
  void paymentName() {
    // implementation
  }

  @override
  void amount() {
    // implementation
  }

  @override
  void bankID() {
    // implementation
  }
  @override
  void virtualAccount() {
    // implementation
  }
}

class BNI implements BankProvider, PaymentProvider {
  @override
  void paymentName() {
    // implementation
  }

  @override
  void amount() {
    // implementation
  }

  @override
  void bankID() {
    // implementation
  }
  @override
  void virtualAccount() {
    // implementation
  }
}
