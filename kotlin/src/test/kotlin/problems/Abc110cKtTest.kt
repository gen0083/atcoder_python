class Abc110cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("azzel\n" +
                "apple", "Yes\n"),
            TestData("chokudai\n" +
                "redcoder", "No\n"),
            TestData("abcdefghijklmnopqrstuvwxyz\n" +
                "ibyhqfrekavclxjstdwgpzmonu", "Yes")
        )
    
    override fun callTestTarget() {
        abc110c()
    }
}