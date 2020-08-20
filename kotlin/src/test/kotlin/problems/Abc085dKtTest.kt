class Abc085dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("1 10\n" +
                "3 5", "3"),
            TestData("2 10\n" +
                "3 5\n" +
                "2 6", "2"),
            TestData("4 1000000000\n" +
                "1 1\n" +
                "1 10000000\n" +
                "1 30000000\n" +
                "1 99999999", "860000004"),
            TestData("5 500\n" +
                "35 44\n" +
                "28 83\n" +
                "46 62\n" +
                "31 79\n" +
                "40 43", "9")
        )
    
    override fun callTestTarget() {
        abc085d()
    }
}