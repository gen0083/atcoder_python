class Abc201cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("ooo???xxxx\n", "108"),
            TestData("o?oo?oxoxo\n", "0"),
            TestData("xxxxx?xxxo\n", "15")
        )

    override fun callTestTarget() {
        abc201c()
    }
}