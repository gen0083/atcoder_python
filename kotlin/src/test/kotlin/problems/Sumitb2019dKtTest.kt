class Sumitb2019dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4\n" +
                "0224", "3\n"),
            TestData("6\n" +
                "123123", "17"),
            TestData("19\n" +
                "3141592653589793238", "329")
        )
    
    override fun callTestTarget() {
        sumitb2019d()
    }
}