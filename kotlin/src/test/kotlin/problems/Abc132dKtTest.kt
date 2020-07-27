class Abc132dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("5 3", "3\n" +
                "6\n" +
                "1\n"),
            TestData("2000 3", "1998\n" +
                "3990006\n" +
                "327341989\n")
        )
    
    override fun callTestTarget() {
        abc132d()
    }
}