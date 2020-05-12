class Abc051cKtTest : BaseTest() {
    // この問題は正解となる出力が複数存在するため、このテストケースでこけてても提出が通る場合がある
    override val testData: List<TestData> = listOf(
        TestData("0 0 1 2", "UURDDLLUUURRDRDDDLLU\n"),
        TestData("-2 -2 1 1", "UURRURRDDDLLDLLULUUURRURRDDDLLDL")
    )
    
    override fun callTestTarget() {
        abc051c()
    }
}