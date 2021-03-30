class Abc054bKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 2\n" +
                "#.#\n" +
                ".#.\n" +
                "#.#\n" +
                "#.\n" +
                ".#", "Yes\n"),
            TestData("4 1\n" +
                "....\n" +
                "....\n" +
                "....\n" +
                "....\n" +
                "#", "No\n")
        )
    
    override fun callTestTarget() {
        abc054b()
    }
}