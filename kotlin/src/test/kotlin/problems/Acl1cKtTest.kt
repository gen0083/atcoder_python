class Acl1cKtTest : BaseTest() {
    
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "3 1\n" +
                        "1 2\n", "1"
            ),
            TestData("4 2\n1 3\n2 3", "1"),
            TestData(
                """10 8
                |2 3
                |5 6
                |3 4
                |5 7
                |3 6
                |6 7
                |9 10
                |8 9
            """.trimMargin(), "2"
            ),
            TestData("2 1\n1 2", "0"),
            TestData("3 2\n1 2\n1 3", "0")
        )
    
    override fun callTestTarget() {
        acl1c()
    }
}