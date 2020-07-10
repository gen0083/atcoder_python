class Arc084aKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2\n" +
                "1 5\n" +
                "2 4\n" +
                "3 6", "3\n"),
            TestData("3\n" +
                "1 1 1\n" +
                "2 2 2\n" +
                "3 3 3", "27"),
            TestData("6\n" +
                "3 14 159 2 6 53\n" +
                "58 9 79 323 84 6\n" +
                "2643 383 2 79 50 288", "87"),
            TestData("""3
                |6 5 4
                |4 9 13
                |11 92 54
            """.trimMargin(), "a")
        )
    
    override fun callTestTarget() {
        arc084a()
    }
}