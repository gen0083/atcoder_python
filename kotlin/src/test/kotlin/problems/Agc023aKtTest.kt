class Agc023aKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("6\n" +
                "1 3 -4 2 2 -2", "3"),
            TestData("7\n" +
                "1 -1 1 -1 1 -1 1", "12"),
            TestData("5\n" +
                "1 -2 3 -4 5", "0")
        )
    
    override fun callTestTarget() {
        agc023a()
    }
}