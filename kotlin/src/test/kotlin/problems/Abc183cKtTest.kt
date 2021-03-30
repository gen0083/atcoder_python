class Abc183cKtTest : BaseTest() {
    
    override val testData: List<TestData>
        get() = listOf(
            TestData("4 330\n" +
                "0 1 10 100\n" +
                "1 0 20 200\n" +
                "10 20 0 300\n" +
                "100 200 300 0\n", "2"),
            TestData("5 5\n" +
                "0 1 1 1 1\n" +
                "1 0 1 1 1\n" +
                "1 1 0 1 1\n" +
                "1 1 1 0 1\n" +
                "1 1 1 1 0\n", "24")
        )
    
    override fun callTestTarget() {
        abc183c()
    }
}