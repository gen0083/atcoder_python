class Arc104bKtTest : BaseTest() {
    
    override val testData: List<TestData>
        get() = listOf(
            TestData("4 AGCT", "2"),
            TestData("4 ATAT", "4"),
            TestData("10 AAATACCGCG", "6")
        )
    
    override fun callTestTarget() {
        arc104b()
    }
}