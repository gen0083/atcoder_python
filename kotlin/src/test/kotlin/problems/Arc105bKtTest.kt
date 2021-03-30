class Arc105bKtTest : BaseTest() {
    
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "2 6 6\n", "2"),
            TestData("15\n" +
                "546 3192 1932 630 2100 4116 3906 3234 1302 1806 3528 3780 252 1008 588\n", "42")
        )
    
    override fun callTestTarget() {
        arc105b()
    }
}