class Abc084cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "6 5 1\n" +
                "1 10 1", "12\n" +
                "11\n" +
                "0\n"),
            TestData("4\n" +
                "12 24 6\n" +
                "52 16 4\n" +
                "99 2 2", "187\n" +
                "167\n" +
                "101\n" +
                "0"),
            TestData("4\n" +
                "12 13 1\n" +
                "44 17 17\n" +
                "66 4096 64", "4162\n" +
                "4162\n" +
                "4162\n" +
                "0")
        )
    
    override fun callTestTarget() {
        abc084c()
    }
}