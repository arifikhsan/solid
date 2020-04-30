class DataRepository {
  private val data = mutableListOf<Any>()

  fun setData() {
    val response = [] // retrieving data...
    data.clear()
    data.putAll(response.data)
  }

  fun getData() = data
}
