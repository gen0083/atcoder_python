import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc295bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "4 4\n" +
                    ".1.#\n" +
                    "###.\n" +
                    ".#2.\n" +
                    "#.##\n", "...#\n" +
                    "#...\n" +
                    "....\n" +
                    "#...\n"
        ),
        TestData(
            "2 5\n" +
                    "..#.#\n" +
                    "###.#\n", "..#.#\n" +
                    "###.#\n"
        ),
        TestData(
            "2 3\n" +
                    "11#\n" +
                    "###\n", "...\n" +
                    "..#\n"
        ),
        TestData(
            "4 6\n" +
                    "#.#3#.\n" +
                    "###.#.\n" +
                    "##.###\n" +
                    "#1..#.\n", "......\n" +
                    "#.....\n" +
                    "#....#\n" +
                    "....#.\n"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc295b()
        }
    }
}
