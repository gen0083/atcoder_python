class Typical90_006KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "7 3\n" +
                    "atcoder\n", "acd"
            ),
            TestData(
                "14 5\n" +
                    "kittyonyourlap\n", "inlap"
            )
        )

    override fun callTestTarget() {
        typical90_006()
    }
}