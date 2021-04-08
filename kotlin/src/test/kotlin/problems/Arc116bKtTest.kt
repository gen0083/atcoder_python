class Arc116bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "3\n" +
                        "2 4 3\n", "63"
            ),
            TestData(
                "1\n" +
                        "10\n", "100"
            ),
            TestData(
                "7\n" +
                        "853983 14095 543053 143209 4324 524361 45154\n", "206521341\n"
            )
        )

    override fun callTestTarget() {
        arc116b()
    }
}