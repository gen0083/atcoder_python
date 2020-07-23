class Agc019bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("aatt", "5\n"),
            TestData("xxxxxxxxxx", "1"),
            TestData("abracadabra", "44"),
            TestData("${"abcdefghij".repeat(20000)}", "2")
        )
    
    override fun callTestTarget() {
        agc019b()
    }
}