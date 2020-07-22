class Abc080cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("1\n" +
                "1 1 0 1 0 0 0 1 0 1\n" +
                "3 4 5 6 7 8 9 -2 -3 4 -2", "8"),
            TestData("2\n" +
                "1 1 1 1 1 0 0 0 0 0\n" +
                "0 0 0 0 0 1 1 1 1 1\n" +
                "0 -2 -2 -2 -2 -2 -1 -1 -1 -1 -1\n" +
                "0 -2 -2 -2 -2 -2 -1 -1 -1 -1 -1", "-2"),
            TestData("3\n" +
                "1 1 1 1 1 1 0 0 1 1\n" +
                "0 1 0 1 1 1 1 0 1 0\n" +
                "1 0 1 1 0 1 0 1 0 1\n" +
                "-8 6 -2 -8 -8 4 8 7 -6 2 2\n" +
                "-9 2 0 1 7 -5 0 -2 -6 5 5\n" +
                "6 -6 7 -9 6 -5 8 0 -9 -7 -7", "23")
        )
    
    override fun callTestTarget() {
        abc080c()
    }
}