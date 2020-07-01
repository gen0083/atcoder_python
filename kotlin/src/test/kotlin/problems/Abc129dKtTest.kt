class Abc129dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4 6\n" +
                "#..#..\n" +
                ".....#\n" +
                "....#.\n" +
                "#.#...", "8\n"),
            TestData("8 8\n" +
                "..#...#.\n" +
                "....#...\n" +
                "##......\n" +
                "..###..#\n" +
                "...#..#.\n" +
                "##....#.\n" +
                "#...#...\n" +
                "###.#..#", "13")
        )
    
    override fun callTestTarget() {
        abc129d()
    }
}