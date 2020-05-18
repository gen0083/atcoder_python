class Agc017aKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2 0\n" +
                "1 3", "2\n"),
            TestData("1 1\n" +
                "50", "0"),
            TestData("3 0\n" +
                "1 1 1", "4\n"),
            TestData("45 1\n" +
                "17 55 85 55 74 20 90 67 40 70 39 89 91 50 16 24 14 43 24 66 25 9 89 71 41 16 53 13 61 15 85 72 62 67 42 26 36 66 4 87 59 91 4 25 26",
                "17592186044416")
        )
    
    override fun callTestTarget() {
        agc017a()
    }
}