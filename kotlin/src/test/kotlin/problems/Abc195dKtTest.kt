class Abc195dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "3 4 3\n" +
                        "1 9\n" +
                        "5 3\n" +
                        "7 8\n" +
                        "1 8 6 9\n" +
                        "4 4\n" +
                        "1 4\n" +
                        "1 3\n", "20\n" +
                        "0\n" +
                        "9\n"
            )
        )

    override fun callTestTarget() {
        abc195d()
    }
}