class Abc134dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "1 0 0", "1\n" +
                "1\n"),
            TestData("5\n" +
                "0 0 0 0 0", "0\n"),
            TestData("6\n1 1 1 1 1 1", "5\n1 2 4 5 6"),
            TestData("5\n1 0 1 0 1", "3\n1 3 5")
        )
    
    override fun callTestTarget() {
        abc134d()
    }
}