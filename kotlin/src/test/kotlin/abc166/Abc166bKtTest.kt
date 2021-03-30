class Abc166bKtTest : BaseTest() {
    override val testData: List<TestData> = listOf(
        TestData("""3 2
2
1 3
1
3""", "1\n"),
        TestData("""3 3
1
3
1
3
1
3""", "2\n")
    )
    
    override fun callTestTarget() {
        abc166b()
    }
}