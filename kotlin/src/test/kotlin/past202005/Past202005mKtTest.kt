class Past202005mKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("", "")
        )
    
    override fun callTestTarget() {
        past202005m()
    }
}