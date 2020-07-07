class Abc006bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("7", "7"),
            TestData("1", "0"),
            TestData("100000", "7927"),
            TestData("1000000", "2576")
        )
    
    override fun callTestTarget() {
        abc006b()
    }
}