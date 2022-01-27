class Paizab103KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                """3
1 2 3
R Y
L C
L R""", "2"
            ),
            TestData(
                """2
30 0 -30
L W
R W""", "no"
            ),
            TestData(
                """3
7 8 7
L G
R M
R G""", "7"
            )
        )

    override fun callTestTarget() {
        paizab103()
    }
}