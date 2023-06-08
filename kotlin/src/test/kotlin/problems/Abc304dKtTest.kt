class Abc304dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "7 6\n" +
                    "5\n" +
                    "6 1\n" +
                    "3 1\n" +
                    "4 2\n" +
                    "1 5\n" +
                    "6 2\n" +
                    "2\n" +
                    "2 5\n" +
                    "2\n" +
                    "3 4\n", "0 2"
            ),
            TestData(
                "4 4\n" +
                    "4\n" +
                    "1 1\n" +
                    "3 1\n" +
                    "3 3\n" +
                    "1 3\n" +
                    "1\n" +
                    "2\n" +
                    "1\n" +
                    "2\n", "1 1"
            ),
            TestData(
                """3 19
                |1
                |3 19
                |1
                |2
                |9
                |2 4 6 8 10 12 14 16 18
            """.trimMargin(), "0 1"
            )
        )

    override fun callTestTarget() {
        abc304d()
    }

}