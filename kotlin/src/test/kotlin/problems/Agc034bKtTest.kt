class Agc034bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("ABCABC", "3"),
            TestData("C", "0"),
            TestData("ABCACCBABCBCAABCB", "6")
        )
    
    override fun callTestTarget() {
        agc034b()
    }
}