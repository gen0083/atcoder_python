class Abc142dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("12 18", "3"),
            TestData("420 660", "4"),
            TestData("1 2019", "1"),
            TestData("99999999999999 99999999999999", "9")
        )
    
    override fun callTestTarget() {
        abc142d()
    }
}