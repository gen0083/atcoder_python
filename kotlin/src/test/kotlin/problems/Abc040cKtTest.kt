class Abc040cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4\n" +
                "100 150 130 120", "40\n"),
            TestData("4\n" +
                "100 125 80 110", "40\n"),
            TestData("9\n" +
                "314 159 265 358 979 323 846 264 338", "310")
        )
    
    override fun callTestTarget() {
        abc040c()
    }
}