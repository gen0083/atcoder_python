class Caddi2018aKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 24", "2"),
            TestData("5 1", "1\n"),
            TestData("1 111", "111"),
            TestData("4 972439611840", "206")
        )
    
    override fun callTestTarget() {
        caddi2018a()
    }
}