class Abc166eKtTest : BaseTest() {
    override val testData: List<TestData> = listOf(
        TestData("""6
2 3 3 1 3 1""", "3\n"),
        TestData("""6
5 2 4 2 8 8""", "0\n"),
        TestData("""32
3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6 2 6 4 3 3 8 3 2 7 9 5""", "22\n")
    )
    
    override fun callTestTarget() {
        abc166e()
    }
}