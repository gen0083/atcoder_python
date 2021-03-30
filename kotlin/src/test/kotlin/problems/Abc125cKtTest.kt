class Abc125cKtTest : BaseTest() {
    
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "7 6 8", "1"),
            TestData("3\n" +
                "12 15 18", "6"),
            TestData("2\n" +
                "1000000000 1000000000", "1000000000\n")
        )
    
    override fun callTestTarget() {
        abc125c()
    }
}