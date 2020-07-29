class Abc121dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2 4", "5"),
            TestData("123 456", "435"),
            TestData("123456789012 123456789012", "123456789012"),
            TestData("5 7", "4")
        )
    
    override fun callTestTarget() {
        abc121d()
    }
}