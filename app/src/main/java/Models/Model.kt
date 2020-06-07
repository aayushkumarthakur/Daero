package Models

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf(
        Hobby("Kotlin Bootcamp for Programmers course"),
        Hobby("Android Kotlin Fundamentals Course"),
        Hobby("Advanced Android in Kotlin Course")
    )
}