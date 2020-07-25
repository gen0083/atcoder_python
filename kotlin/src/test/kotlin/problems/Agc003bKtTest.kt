class Agc003bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4\n" +
                "4\n" +
                "0\n" +
                "3\n" +
                "2", "4\n"),
            TestData("8\n" +
                "2\n" +
                "0\n" +
                "1\n" +
                "6\n" +
                "0\n" +
                "8\n" +
                "2\n" +
                "1", "9"),
            TestData("""6
                |1
                |0
                |3
                |1
                |0
                |5
            """.trimMargin(), "4")
        )
    
    override fun callTestTarget() {
        agc003b()
    }
}