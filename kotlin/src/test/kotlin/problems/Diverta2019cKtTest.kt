class Diverta2019cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "ABCA\n" +
                "XBAZ\n" +
                "BAD", "2"),
            TestData("9\n" +
                "BEWPVCRWH\n" +
                "ZZNQYIJX\n" +
                "BAVREA\n" +
                "PA\n" +
                "HJMYITEOX\n" +
                "BCJHMRMNK\n" +
                "BP\n" +
                "QVFABZ\n" +
                "PRGKSPUNA", "4"),
            TestData("7\n" +
                "RABYBBE\n" +
                "JOZ\n" +
                "BMHQUVA\n" +
                "BPA\n" +
                "ISU\n" +
                "MCMABAOBHZ\n" +
                "SZMEHMA", "4"),
            TestData("""3
                |ABBX
                |BAA
                |BAA
            """.trimMargin(), "2"),
            TestData("""5
                |XXA
                |XXA
                |XXA
                |BXX
                |BXA
            """.trimMargin(), "2"),
            TestData("""5
                |BXX
                |BXX
                |BXX
                |XXA
                |BXA
            """.trimMargin(), "2"),
            TestData("""5
                |XXA
                |BXX
                |BXA
                |BXA
                |BXA
            """.trimMargin(), "4")
        )
    
    override fun callTestTarget() {
        diverta2019c()
    }
}