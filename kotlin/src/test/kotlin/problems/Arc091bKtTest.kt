class Arc091bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("5 2", "7"),
            TestData("10 0", "100"),
            TestData("31415 9265", "287927211"),
            TestData("1 1", "0"),
            TestData("1 0", "1")
        )
    
    override fun callTestTarget() {
        arc091b()
    }
}