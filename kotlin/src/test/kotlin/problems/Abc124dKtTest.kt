class Abc124dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("5 1\n" +
                "00010", "4"),
            TestData("14 2\n" +
                "11101010110011", "8"),
            TestData("1 1\n" +
                "1", "1"),
            TestData("8 1\n00101001", "4")
        )
    
    override fun callTestTarget() {
        abc124d()
    }
}