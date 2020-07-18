class Tenka1_2018cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("5\n" +
                "6\n" +
                "8\n" +
                "1\n" +
                "2\n" +
                "3", "21"),
            TestData("6\n" +
                "3\n" +
                "1\n" +
                "4\n" +
                "1\n" +
                "5\n" +
                "9", "25"),
            TestData("3\n" +
                "5\n" +
                "5\n" +
                "1", "8"),
            TestData("""8
                |1
                |1
                |1
                |1
                |1
                |1
                |1
                |1
            """.trimMargin(), "0"),
            TestData("2\n1\n9", "8"),
            TestData("3\n1\n1000000000\n1", "1999999998"),
            TestData("3\n1\n900\n900", "1798"),
            TestData("100000\n${buildString { for (i in 1..100000) append("$i\n") }}", "9")
        )
    
    override fun callTestTarget() {
        tenka1_2018c()
    }
}