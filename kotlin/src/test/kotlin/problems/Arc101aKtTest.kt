class Arc101aKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("5 3\n" +
                "-30 -10 10 20 50", "40"),
            TestData("3 2\n" +
                "10 20 30", "20"),
            TestData("1 1\n" +
                "0", "0"),
            TestData("8 5\n" +
                "-9 -7 -4 -3 1 2 3 4", "10")
        )
    
    override fun callTestTarget() {
        arc101a()
    }
}