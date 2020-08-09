class Agc047aKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("5\n" +
                "7.5\n" +
                "2.4\n" +
                "17.000000001\n" +
                "17\n" +
                "16.000000000", "3"),
            TestData("11\n" +
                "0.9\n" +
                "1\n" +
                "1\n" +
                "1.25\n" +
                "2.30000\n" +
                "5\n" +
                "70\n" +
                "0.000000001\n" +
                "9999.999999999\n" +
                "0.999999999\n" +
                "1.000000001", "8")
        )
    
    override fun callTestTarget() {
        agc047a()
    }
}