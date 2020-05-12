class Abc125dKtTest : BaseTest() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "-10 5 -4", "19\n"),
        TestData("5\n" +
            "10 -4 -8 -11 3", "30"),
        TestData("11\n" +
            "-1000000000 1000000000 -1000000000 1000000000 -1000000000 0 1000000000 -1000000000 1000000000 -1000000000 1000000000",
            "10000000000\n")
    )
    
    override fun callTestTarget() {
        abc125d()
    }
}