class Abc076cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("?tc????\n" +
                "coder", "atcoder\n"),
            TestData("??p??d??\n" +
                "abc", "UNRESTORABLE\n"),
            TestData("??ab?def\nabc", "aaabcdef")
        )
    
    override fun callTestTarget() {
        abc076c()
    }
}