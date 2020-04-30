class FoodService(
    private var id: Int,
    private var name: String,
    private var date: String
) {

    fun addToStore() {
        if (!FoodExpiry.isExpired(date)) {
            //Add to store
        }
    }
}

object FoodExpiry {
  private fun isExpired(date: String?): Boolean {
    var foodDate = Date()
    val now = Date()
    val dateFormat = SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH)
    try {
        foodDate = dateFormat.parse(date)
    } catch (e: ParseException) {
        e.printStackTrace()
    }

    return foodDate.time >= now.time
}
}
