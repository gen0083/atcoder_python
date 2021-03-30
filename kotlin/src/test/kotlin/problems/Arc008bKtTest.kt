class Arc008bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("7 26\n" +
                "NAOHIRO\n" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "2"),
            TestData("8 8\n" +
                "TAKOYAKI\n" +
                "TAKOYAKI", "1"),
            TestData("8 4\n" +
                "CHOKUDAI\n" +
                "MYON", "-1"),
            TestData("6 6\n" +
                "MONAKA\n" +
                "NAMAKO", "1")
        )
    
    override fun callTestTarget() {
        arc008b()
    }
}