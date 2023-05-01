import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc295cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "6\n" +
                    "4 1 7 4 1 4\n", "2\n"
        ),
        TestData(
            "1\n" +
                    "158260522\n", "0\n"
        ),
        TestData(
            "10\n" +
                    "295 2 29 295 29 2 29 295 2 29\n", "4\n"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc295c()
        }
    }
}
