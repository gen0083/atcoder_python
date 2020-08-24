class Abc099cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("127", "4"),
            TestData("3", "3"),
            TestData("44852", "16")
        )
    
    override fun callTestTarget() {
        abc099c()
    }
}