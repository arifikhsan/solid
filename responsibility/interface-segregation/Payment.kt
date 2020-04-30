interface PaymentProvider {
  fun paymentName()
  fun amount()
}

interface EWalletProvider {
  fun accountID()
  fun walletProviderID()
}

interface BankProvider {
  fun bankId()
  fun virtualAccount()
}

class Gopay : EWalletProvider, PaymentProvider {
  override fun paymentName() {
      // Implementation code
  }
  override fun amount() {
      // Implementation code
  }
  override fun accountID() {
      // Implementation code
  }
  override fun walletProviderID() {
      // Implementation code
  }
}

class Mandiri : BankProvider, PaymentProvider {
  override fun paymentName() {
      // Implementation code
  }
  override fun amount() {
      // Implementation code
  }
  override fun bankID() {
      // Implementation code
  }
  override fun virtualAccount() {
      // Implementation code
  }
}

class BNI : BankProvider, PaymentProvider {
  override fun paymentName() {
      // Implementation code
  }
  override fun amount() {
      // Implementation code
  }
  override fun bankID() {
      // Implementation code
  }
  override fun virtualAccount() {
      // Implementation code
  }
}
