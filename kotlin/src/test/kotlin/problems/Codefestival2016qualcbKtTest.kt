class Codefestival2016qualcbKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("7 3\n" +
                "3 2 2", "0"),
            TestData("6 3\n" +
                "1 4 1", "1"),
            TestData("100 1\n" +
                "100", "99"),
            TestData("7 3\n1 1 5", "2"),
            TestData("3 3\n1 1 1", "0")
        )
    
    override fun callTestTarget() {
        codefestival2016qualcb()
    }
}