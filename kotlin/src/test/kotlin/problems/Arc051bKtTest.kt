class Arc051bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("1", "1 1"),
            TestData("3", "4 5"),
            TestData("12", "314159265 358979323\n"),
            TestData("40", "1 1")
        )
    
    override fun callTestTarget() {
        arc051b()
    }
}