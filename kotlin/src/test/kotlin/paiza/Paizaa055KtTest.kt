class Paizaa055KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                """7 6
######
#....#
#.##.#
#.#S.#
#.####
#.....
######""", "YES"
            ),
            TestData(
                """7 6
......
......
.####.
#..S.#
#....#
.####.
......""", "NO"
            ),
            TestData(
                """7 6
######
.....#
####.#
#.S#.#
#.##.#
#....#
######""", "YES"
            )
        )

    override fun callTestTarget() {
        paizaa055()
    }
}