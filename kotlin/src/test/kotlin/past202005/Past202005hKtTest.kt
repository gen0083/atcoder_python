class Past202005hKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2 5\n" +
                "1 4\n" +
                "2 2 20", "10\n"),
            TestData("4 5\n" +
                "1 2 3 4\n" +
                "2 20 100", "164"),
            TestData("10 19\n" +
                "1 3 4 5 7 8 10 13 15 17\n" +
                "2 1000 10", "138")
        )
    
    override fun callTestTarget() {
        past202005h()
    }
}