class Abc166cKtTest : BaseTest() {
    override val testData: List<TestData> = listOf(
        TestData("""4 3
1 2 3 4
1 3
2 3
2 4""", "2\n"),
        TestData("""6 5
8 6 9 1 2 1
1 3
4 2
4 3
4 6
4 6""", "3\n")
    )
    
    override fun callTestTarget() {
        abc166c()
    }
}