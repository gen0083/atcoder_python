import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc206cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "3\n" +
                    "1 7 1\n", "2"
        ),
        TestData(
            "10\n" +
                    "1 10 100 1000 10000 100000 1000000 10000000 100000000 1000000000\n", "45"
        ),
        TestData(
            "20\n" +
                    "7 8 1 1 4 9 9 6 8 2 4 1 1 9 5 5 5 3 6 4\n", "173"
        ),
        TestData("3\n1 7 7", "2"),
        TestData("3\n1 1 1", "0"),
        TestData("2\n1 2", "1"),
        TestData("11\n1 1 1 1 1 1 1 1 1 1 10", "0")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc206c()
        }
    }
}
