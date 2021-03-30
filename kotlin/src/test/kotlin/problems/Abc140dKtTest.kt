class Abc140dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("6 1\n" +
                "LRLRRL", "3\n"),
            TestData("13 3\n" +
                "LRRLRLRRLRLLR", "9"),
            TestData("10 1\n" +
                "LLLLLRRRRR", "9"),
            TestData("9 2\n" +
                "RRRLRLRLL", "7")
        )
    
    override fun callTestTarget() {
        abc140d()
    }
}