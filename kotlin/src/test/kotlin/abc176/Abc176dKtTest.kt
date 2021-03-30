import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc176dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4 4\n" +
            "1 1\n" +
            "4 4\n" +
            "..#.\n" +
            "..#.\n" +
            ".#..\n" +
            ".#..", "1"),
        TestData("4 4\n" +
            "1 4\n" +
            "4 1\n" +
            ".##.\n" +
            "####\n" +
            "####\n" +
            ".##.", "-1"),
        TestData("4 4\n" +
            "2 2\n" +
            "3 3\n" +
            "....\n" +
            "....\n" +
            "....\n" +
            "....", "0"),
        TestData("4 5\n" +
            "1 2\n" +
            "2 5\n" +
            "#.###\n" +
            "####.\n" +
            "#..##\n" +
            "#..##", "2"),
        TestData("""4 4
            |1 1
            |4 3
            |..##
            |.###
            |##.#
            |##.#
        """.trimMargin(), "1"),
        TestData("""4 4
            |1 1
            |4 3
            |.###
            |####
            |####
            |.#.#
        """.trimMargin(), "-1"),
        TestData("""4 4
            |1 1
            |4 4
            |.#.#
            |#.#.
            |.#.#
            |#.#.
        """.trimMargin(), "2")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc176d()
        }
    }
}
