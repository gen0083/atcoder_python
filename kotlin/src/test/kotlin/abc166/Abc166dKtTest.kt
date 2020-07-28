class Abc166dKtTest : BaseTest() {
    // 条件に当てはまる組であればなんでもいいので、このとおりでなくてもACする
    override val testData: List<TestData> = listOf(
        TestData("33", "2 -1\n"),
        TestData("1", "0 -1\n"),
        TestData("1${"0".repeat(9)}", "1 1\n")
    )
    
    override fun callTestTarget() {
        abc166d()
    }
}