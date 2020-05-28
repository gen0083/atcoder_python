class Abc138dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("4 3\n" +
                "1 2\n" +
                "2 3\n" +
                "2 4\n" +
                "2 10\n" +
                "1 100\n" +
                "3 1", "100 110 111 110\n"),
            TestData("6 2\n" +
                "1 2\n" +
                "1 3\n" +
                "2 4\n" +
                "3 6\n" +
                "2 5\n" +
                "1 10\n" +
                "1 10", "20 20 20 20 20 20"),
            // 必ず先にあるノードが親である、という条件はないのでこういう入力もありうる
            // 例えば1 -> 3 -> 2という一直線のツリー
            TestData("""3 2
1 3
2 3
1 10
2 5
""", "10 15 10"),
            TestData("200000 2\n" + buildString {
                for (i in 1 until 200000) {
                    append("$i ${i + 1}\n")
                }
                append("1 5\n200000 1")
            }, "1 ")
        )
    
    override fun callTestTarget() {
        abc138d()
    }
}
