class Past202005nKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("", "")
        )
    
    override fun callTestTarget() {
        past202005n()
    }
}