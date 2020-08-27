class Arc019bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("ARC\n", "73"),
            TestData("S\n", "0"),
            TestData("NOLEMONNOMELON\n", "350"),
            TestData("ASBDA", "123"),
            TestData("ASBDZ", "125"),
            TestData("BASBDAB", "173")
        )
    
    override fun callTestTarget() {
        arc019b()
    }
}