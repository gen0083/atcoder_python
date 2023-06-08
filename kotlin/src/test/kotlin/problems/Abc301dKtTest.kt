class Abc301dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "?0?\n" +
                    "2\n", "1"
            ),
            TestData(
                "101\n" +
                    "4\n", "-1"
            ),
            TestData(
                "0?0?\n" +
                    "1000000000000000000\n", "5"
            )
        )

    override fun callTestTarget() {
        abc301d()
    }

}