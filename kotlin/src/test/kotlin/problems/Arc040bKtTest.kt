class Arc040bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("7 3\n" +
                "...o.o.", "6\n"),
            TestData("8 4\n" +
                "...o.ooo", "3\n"),
            TestData("4 4\n" +
                "oooo", "0\n"),
            TestData("10 4\n..oooooooo", "1"),
            TestData("17 4\nooo..oo.oo.......", "17")
        )
    
    override fun callTestTarget() {
        arc040b()
    }
}