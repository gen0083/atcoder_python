class Divelta2019_2bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2\n" +
                "1 1\n" +
                "2 2", "1\n"),
            TestData("3\n" +
                "1 4\n" +
                "4 6\n" +
                "7 8", "1"),
            TestData("4\n" +
                "1 1\n" +
                "1 2\n" +
                "2 1\n" +
                "2 2", "2"),
            TestData("4\n" +
                "1 4\n" +
                "4 6\n" +
                "7 8\n" +
                "30 34", "2"),
            TestData("""6
                |1 1
                |5 5
                |1 2
                |3 3
                |6 3
                |4 4
            """.trimMargin(), "3"),
            TestData("""13
                |6 1
                |-4 10
                |-10 1
                |-5 -1
                |6 -15
                |2 -5
                |0 0
                |-2 5
                |4 -10
                |10 1
                |-6 1
                |-5 -1
                |-8 -3
            """.trimMargin(), "5")
        )
    
    override fun callTestTarget() {
        divelta2019_2b()
    }
}