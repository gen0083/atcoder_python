class Abc146dKtTest : BaseTest() {
    // 正解は複数パターンなのでこのテストケースと一致する必要はない
    override val testData: List<TestData>
        get() = listOf(
            TestData("3\n" +
                "1 2\n" +
                "2 3", "2\n" +
                "1\n" +
                "2"),
            TestData("8\n" +
                "1 2\n" +
                "2 3\n" +
                "2 4\n" +
                "2 5\n" +
                "4 7\n" +
                "5 6\n" +
                "6 8", "4\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "1\n" +
                "1\n" +
                "2"),
            TestData("6\n" +
                "1 2\n" +
                "1 3\n" +
                "1 4\n" +
                "1 5\n" +
                "1 6", "5\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5")
        )
    
    override fun callTestTarget() {
        abc146d()
    }
}