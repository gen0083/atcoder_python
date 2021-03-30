class Abc127dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 2\n" +
                "5 1 4\n" +
                "2 3\n" +
                "1 5", "14\n"),
            TestData("10 3\n" +
                "1 8 5 7 100 4 52 33 13 5\n" +
                "3 10\n" +
                "4 30\n" +
                "1 4", "338"),
            TestData("3 2\n" +
                "100 100 100\n" +
                "3 99\n" +
                "3 99", "300"),
            TestData("11 3\n" +
                "1 1 1 1 1 1 1 1 1 1 1\n" +
                "3 1000000000\n" +
                "4 1000000000\n" +
                "3 1000000000", "10000000001\n"),
            TestData("100000 1\n" + IntArray(100000) { 1 }.joinToString(" ") + "\n" +
                "100000 2", "200000")
        )
    
    override fun callTestTarget() {
        abc127d()
    }
}