class Abc049cKtTest : BaseTest() {
    override val testData: List<TestData> = listOf(
        TestData("erasedream", "YES\n"),
        TestData("dreameraser", "YES\n"),
        TestData("dreamerer", "NO\n")
    )
    
    override fun callTestTarget() {
        abc049c()
    }
}