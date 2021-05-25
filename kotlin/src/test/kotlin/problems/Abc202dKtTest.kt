class Abc202dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("2 2 4\n", "baab"),
            TestData("30 30 118264581564861424\n", "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n")
        )

    override fun callTestTarget() {
        abc202d()
    }
}