class Agc032bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3", "2\n" +
                "1 3\n" +
                "2 3\n"),
            TestData("4", """4
                |1 2
                |1 3
                |2 4
                |3 4
            """.trimMargin()),
            TestData("5", """8
                |1 2
                |1 3
                |1 5
                |2 4
                |2 5
                |3 4
                |3 5
                |4 5
            """.trimMargin()),
            TestData("6", "1"),
            TestData("7", "1"),
            TestData("8", "1")
        )
    
    override fun callTestTarget() {
        agc032b()
    }
}