class Abc160eKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("1 2 2 2 1\n" +
                "2 4\n" +
                "5 1\n" +
                "3", "12\n"),
            TestData("2 2 2 2 2\n" +
                "8 6\n" +
                "9 1\n" +
                "2 1", "25"),
            TestData("2 2 4 4 4\n" +
                "11 12 13 14\n" +
                "21 22 23 24\n" +
                "1 2 3 4", "74")
        )
    
    override fun callTestTarget() {
        abc160e()
    }
}