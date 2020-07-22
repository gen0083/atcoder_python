class Tenka1_2017cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2\n", "1 2 2\n"),
            TestData("3485", "872 1012974 1539173474040"),
            TestData("4664", "3498 3498 3498")
        )
    
    override fun callTestTarget() {
        tenka1_2017c()
    }
}