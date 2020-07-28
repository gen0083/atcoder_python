class Abc133dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "2 2 4", "4 0 4\n"),
            TestData("5\n" +
                "3 8 7 5 5", "2 4 12 2 8"),
            TestData("3\n" +
                "1000000000 1000000000 0", "0 2000000000 0"),
            TestData("99999\n${IntArray(99999) { 2 }.joinToString(" ")}",
                IntArray(99999) { 2 }.joinToString(" "))
        )
    
    override fun callTestTarget() {
        abc133d()
    }
}