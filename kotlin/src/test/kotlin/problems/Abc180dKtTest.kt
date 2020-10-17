class Abc180dKtTest : BaseTest() {
    
    override val testData: List<TestData>
        get() = listOf(
            TestData("4 20 2 10\n", "2"),
            TestData("1 1000000000000000000 10 1000000000\n", "1000000007\n")
        )
    
    override fun callTestTarget() {
        abc180d()
    }
}