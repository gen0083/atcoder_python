class Abc189dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "2\n" +
                        "AND\n" +
                        "OR\n", "5"
            ),
            TestData(
                "5\n" +
                        "OR\n" +
                        "OR\n" +
                        "OR\n" +
                        "OR\n" +
                        "OR\n", "63"
            )
        )

    override fun callTestTarget() {
        abc189d()
    }
}