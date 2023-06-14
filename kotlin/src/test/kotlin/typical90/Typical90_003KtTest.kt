class Typical90_003KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "3\n" +
                    "1 2\n" +
                    "2 3\n", "3"
            ),
            TestData(
                "5\n" +
                    "1 2\n" +
                    "2 3\n" +
                    "3 4\n" +
                    "3 5\n", "4"
            ),
            TestData(
                "10\n" +
                    "1 2\n" +
                    "1 3\n" +
                    "2 4\n" +
                    "4 5\n" +
                    "4 6\n" +
                    "3 7\n" +
                    "7 8\n" +
                    "8 9\n" +
                    "8 10\n", "8"
            )
        )

    override fun callTestTarget() {
        typical90_003()
    }
}