class Past202005jKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2 5\n" +
                "5 3 2 4 8", "1\n" +
                "2\n" +
                "-1\n" +
                "2\n" +
                "1\n"),
            TestData("5 10\n" +
                "13 16 6 15 10 18 13 17 11 3", "1\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "3\n" +
                "1\n" +
                "3\n" +
                "2\n" +
                "4\n" +
                "5"),
            TestData("10 30\n" +
                "35 23 43 33 38 25 22 39 22 6 41 1 15 41 3 20 50 17 25 14 1 22 5 10 34 38 1 12 15 1",
                "1\n" +
                    "2\n" +
                    "1\n" +
                    "2\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "2\n" +
                    "5\n" +
                    "6\n" +
                    "2\n" +
                    "7\n" +
                    "6\n" +
                    "3\n" +
                    "7\n" +
                    "6\n" +
                    "1\n" +
                    "7\n" +
                    "4\n" +
                    "8\n" +
                    "9\n" +
                    "6\n" +
                    "9\n" +
                    "9\n" +
                    "4\n" +
                    "4\n" +
                    "10\n" +
                    "9\n" +
                    "8\n" +
                    "-1")
        )
    
    override fun callTestTarget() {
        past202005j()
    }
}