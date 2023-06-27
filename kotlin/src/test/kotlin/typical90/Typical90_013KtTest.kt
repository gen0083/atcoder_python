class Typical90_013KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
                TestData("7 9\n" +
                        "1 2 2\n" +
                        "1 3 3\n" +
                        "2 5 2\n" +
                        "3 4 1\n" +
                        "3 5 4\n" +
                        "4 7 5\n" +
                        "5 6 1\n" +
                        "5 7 6\n" +
                        "6 7 3\n", "8\n" +
                        "8\n" +
                        "9\n" +
                        "9\n" +
                        "8\n" +
                        "8\n" +
                        "8\n"),
                TestData("4 3\n" +
                        "1 2 1\n" +
                        "2 3 10\n" +
                        "3 4 100\n", "111\n" +
                        "111\n" +
                        "111\n" +
                        "111\n"),
                TestData("4 3\n" +
                        "1 2 314\n" +
                        "1 3 159\n" +
                        "1 4 265\n", "265\n" +
                        "893\n" +
                        "583\n" +
                        "265\n")
        )

    override fun callTestTarget() {
        typical90_013()
    }
}