class Abc115dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            //            TestData("2 7", "4"),
            //            TestData("1 1", "0"),
            //            TestData("50 4321098765432109", "2160549382716056\n"),
            //            TestData("1 1", "0"),
            //            TestData("1 2", "1"),
            //            TestData("1 3", "2"),
            //            TestData("1 4", "3"),
            //            TestData("1 5", "3"),
            //            TestData("2 1", "0"),
            //            TestData("2 2", "0"),
            //            TestData("2 3", "1"),
            //            TestData("2 4", "2"),
            //            TestData("2 5", "3"),
            TestData("2 6", "3"),
            TestData("2 7", "4"),
            TestData("2 8", "4"),
            TestData("2 9", "5"),
            TestData("2 10", "6"),
            TestData("2 11", "7"),
            TestData("2 12", "7"),
            TestData("2 13", "7")
        )
    
    override fun callTestTarget() {
        abc115d()
    }
}