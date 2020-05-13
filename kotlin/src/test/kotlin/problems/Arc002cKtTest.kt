class Arc002cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4\n" +
                "ABXY\n", "2\n"),
            TestData("13\n" +
                "ABABABABXBXBX\n", "7\n"),
            TestData("8\n" +
                "AABBAABB\n", "4\n"),
            TestData("6\nAAAAAB", "3"),
            TestData("8\nAAAAABAA", "4")
        )
    
    override fun callTestTarget() {
        arc002c()
    }
}