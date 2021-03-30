class Abc006cKtTest : BaseTest() {
    // 正答は複数パターンあるので、テストケースが落ちてもACになることもある
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 9", "1 1 1"),
            TestData("7 23", "1 3 3"),
            TestData("10 41", "-1 -1 -1"),
            TestData("5 11", "4 1 0"),
            TestData("5 19", "0 1 4"),
            TestData("5 17", "1 1 3")
        )
    
    override fun callTestTarget() {
        abc006c()
    }
}