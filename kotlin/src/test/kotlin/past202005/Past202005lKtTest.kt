class Past202005lKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2\n" +
                "3 1 200 1000\n" +
                "5 20 30 40 50 2\n" +
                "5\n" +
                "1 1 1 2 2", "20\n" +
                "30\n" +
                "40\n" +
                "200\n" +
                "1000\n"),
            TestData("10\n" +
                "6 8 24 47 29 73 13\n" +
                "1 4\n" +
                "5 72 15 68 49 16\n" +
                "5 65 20 93 64 91\n" +
                "6 100 88 63 50 90 44\n" +
                "2 6 1\n" +
                "10 14 2 76 28 21 78 43 11 97 70\n" +
                "5 31 9 62 84 40\n" +
                "8 10 46 96 23 98 19 38 51\n" +
                "2 37 77\n" +
                "20\n" +
                "1 1 1 1 2 2 2 1 1 2 2 2 2 2 1 2 1 2 2 1", "100\n" +
                "88\n" +
                "72\n" +
                "65\n" +
                "93\n" +
                "77\n" +
                "68\n" +
                "63\n" +
                "50\n" +
                "90\n" +
                "64\n" +
                "91\n" +
                "49\n" +
                "46\n" +
                "44\n" +
                "96\n" +
                "37\n" +
                "31\n" +
                "62\n" +
                "20")
        )
    
    override fun callTestTarget() {
        past202005l()
    }
}