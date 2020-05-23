class Past202005oKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("", "")
        )
    
    override fun callTestTarget() {
        past202005g()
    }
}