class Arc006bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 2\n" +
                "| |-|\n" +
                "|-| |\n" +
                "o    ", "3"),
            TestData("10 2\n" +
                "| |-| |-| |-| |-| |\n" +
                "|-| |-| |-| |-| |-|\n" +
                "            o      ", "9"),
            TestData("1 5\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "o", "1"),
            TestData("4 2\n" +
                "| | | |\n" +
                "| | | |\n" +
                "      o", "4"),
            TestData("9 8\n" +
                "| | | | | | | | |\n" +
                "|-| | |-| | |-| |\n" +
                "| | |-| | |-| | |\n" +
                "| |-| | | | | |-|\n" +
                "| | | |-| | | |-|\n" +
                "| | |-| |-| | | |\n" +
                "|-| | |-| | |-| |\n" +
                "| | | | | |-| | |\n" +
                "            o    ", "3")
        )
    
    override fun callTestTarget() {
        arc006b()
    }
}