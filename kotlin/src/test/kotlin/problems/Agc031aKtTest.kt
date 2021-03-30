class Agc031aKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4\n" +
                "abcd", "15"),
            TestData("3\n" +
                "baa", "5"),
            TestData("5\n" +
                "abcab", "17"),
            TestData("1\na", "1")
        )
    
    override fun callTestTarget() {
        agc031a()
    }
}