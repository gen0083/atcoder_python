class Agc032aKtTest : BaseTest() {
    // 受付られる正答は複数パターン存在するので、テストがfailしてもACになる場合がある
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "1 2 1", "1\n" +
                "1\n" +
                "2\n"),
            TestData("2\n" +
                "2 2", "-1"),
            TestData("9\n" +
                "1 1 1 2 2 1 2 3 2", "1\n" +
                "2\n" +
                "2\n" +
                "3\n" +
                "1\n" +
                "2\n" +
                "2\n" +
                "1\n" +
                "1")
        )
    
    override fun callTestTarget() {
        agc032a()
    }
}