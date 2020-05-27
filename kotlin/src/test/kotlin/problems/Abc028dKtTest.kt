class Abc028dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 2", "0.48148148148148148148\n"),
            TestData("3 1", "0.25925925925925925926"),
            TestData("765 573", "0.00147697396984624371")
        )
    
    override fun callTestTarget() {
        abc028d()
    }
}