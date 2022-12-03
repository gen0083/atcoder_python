import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc280aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "3 5\n" +
                    "#....\n" +
                    ".....\n" +
                    ".##..\n", "3"
        ),
        TestData(
            "1 10\n" +
                    "..........\n", "0"
        ),
        TestData(
            "6 5\n" +
                    "#.#.#\n" +
                    "....#\n" +
                    "..##.\n" +
                    "####.\n" +
                    "..#..\n" +
                    "#####\n", "16"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc280a()
        }
    }
}
