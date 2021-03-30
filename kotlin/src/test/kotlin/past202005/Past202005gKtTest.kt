class Past202005gKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("1 2 2\n" +
                "1 1", "3\n"),
            TestData("1 2 2\n" +
                "2 1", "2"),
            TestData("5 -2 3\n" +
                "1 1\n" +
                "-1 1\n" +
                "0 1\n" +
                "-2 1\n" +
                "-3 1", "6"),
            TestData("""8 3 3
-1 -1
0 -1
1 -1
3 0
1 0
-1 1
1 1
0 1
""", "7")
        )
    
    override fun callTestTarget() {
        past202005g()
    }
}