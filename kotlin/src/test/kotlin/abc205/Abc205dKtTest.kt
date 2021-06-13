import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc205dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "4 3\n" +
                    "3 5 6 7\n" +
                    "2\n" +
                    "5\n" +
                    "3\n", "2\n" +
                    "9\n" +
                    "4\n"
        ),
        TestData(
            "5 2\n" +
                    "1 2 3 4 5\n" +
                    "1\n" +
                    "10\n", "6\n" +
                    "15\n"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc205d()
        }
    }
}
