class Abc141dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 3\n" +
                "2 13 8", "9"),
            TestData("4 4\n" +
                "1 9 3 5", "6"),
            TestData("1 100000\n" +
                "1000000000", "0"),
            TestData("10 1\n" +
                "1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000",
                "9500000000")
        )
    
    override fun callTestTarget() {
        abc141d()
    }
}