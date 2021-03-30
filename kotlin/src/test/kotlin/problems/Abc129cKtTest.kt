class Abc129cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("6 1\n" +
                "3", "4\n"),
            TestData("10 2\n" +
                "4\n" +
                "5", "0\n"),
            TestData("100 5\n" +
                "1\n" +
                "23\n" +
                "45\n" +
                "67\n" +
                "89", "608200469\n"),
            TestData("4 0", "5"),
            TestData("""6 2
                |3
                |4
            """.trimMargin(), "0"),
            TestData("1 0", "1"),
            TestData("1 1\n1", "0"),
            TestData("""6 3
                |1
                |3
                |5
            """.trimMargin(), "1")
        )
    
    override fun callTestTarget() {
        abc129c()
    }
}