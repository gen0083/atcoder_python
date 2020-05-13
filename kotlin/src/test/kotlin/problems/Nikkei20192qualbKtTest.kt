class Nikkei20192qualbKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4\n" +
                "0 1 1 2", "2"),
            TestData("4\n" +
                "1 1 1 1", "0"),
            TestData("7\n" +
                "0 3 2 1 2 2 1", "24"),
            TestData("7\n0 3 3 1 3 3 1", "0")
        )
    
    override fun callTestTarget() {
        nikkei20192qualb()
    }
}