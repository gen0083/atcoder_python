class Paizaa054KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                """5 3 4
2 3
3 1
3 2
4 2""", "2"
            ),
            TestData(
                """5 3 3
2 1
3 2
4 3""", "3"
            )
        )

    override fun callTestTarget() {
        paizaa054()
    }
}