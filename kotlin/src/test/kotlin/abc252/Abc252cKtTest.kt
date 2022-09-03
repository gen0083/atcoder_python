import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc252cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
            TestData("3\n" +
                    "1937458062\n" +
                    "8124690357\n" +
                    "2385760149\n", "6"),
            TestData("5\n" +
                    "0123456789\n" +
                    "0123456789\n" +
                    "0123456789\n" +
                    "0123456789\n" +
                    "0123456789\n", "40")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc252c()
        }
    }
}
