class Abc048cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 3\n" +
                "2 2 2", "1\n"),
            TestData("6 1\n" +
                "1 6 1 2 0 4", "11\n"),
            TestData("5 9\n" +
                "3 1 4 1 5", "0\n"),
            TestData("2 0\n" +
                "5 5", "10\n"),
            TestData("3 5\n5 4 3", "4"),
            TestData("3 5\n1 3 4", "2"),
            TestData("3 5\n3 5 1", "3")
        )
    
    override fun callTestTarget() {
        abc048c()
    }
}