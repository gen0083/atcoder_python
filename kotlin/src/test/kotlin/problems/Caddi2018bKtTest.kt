class Caddi2018bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2\n" +
                "1\n" +
                "2", "first\n"),
            TestData("3\n" +
                "100000\n" +
                "30000\n" +
                "20000", "second")
        )
    
    override fun callTestTarget() {
        caddi2018b()
    }
}