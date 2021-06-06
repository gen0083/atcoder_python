import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc204cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "3 3\n" +
                    "1 2\n" +
                    "2 3\n" +
                    "3 2\n", "7"
        ),
        TestData("3 0\n", "3"),
        TestData(
            "4 4\n" +
                    "1 2\n" +
                    "2 3\n" +
                    "3 4\n" +
                    "4 1\n", "16"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc204c()
        }
    }
}
