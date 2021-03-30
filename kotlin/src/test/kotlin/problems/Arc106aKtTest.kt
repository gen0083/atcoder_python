class Arc106aKtTest : BaseTest() {
    
    override val testData: List<TestData>
        get() = listOf(
            TestData("106\n", "4 2"),
            TestData("1024\n", "-1"),
            TestData("10460353208\n", "21 1")
        )
    
    override fun callTestTarget() {
        arc106a()
    }
}