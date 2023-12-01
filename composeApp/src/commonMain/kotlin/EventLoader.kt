object EventLoader {
    fun getNextEvent(): Event {
        return Event(
            title = "First Event",
            description = "This is a first event shared between platforms.",
            startDate = "2023-12-04T18:00:00Z",
            endDate = "2023-12-04T23:00:00Z",
            placeLabel = "La Cantine",
            placeAddress = "4 Allée du Chateau Blanc, 59140 Wasquehal",
            placeCoordinates = "4.1233,51.123455"
        )
    }
}

data class Event(
    val title: String,
    val description: String,
    val startDate: String,
    val endDate: String,
    val placeLabel: String,
    val placeAddress: String,
    val placeCoordinates: String,
)
