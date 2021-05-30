import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc203cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "2 3\n" +
                    "2 1\n" +
                    "5 10\n", "4"
        ),
        TestData(
            "5 1000000000\n" +
                    "1 1000000000\n" +
                    "2 1000000000\n" +
                    "3 1000000000\n" +
                    "4 1000000000\n" +
                    "5 1000000000\n", "6000000000\n"
        ),
        TestData(
            "3 2\n" +
                    "5 5\n" +
                    "2 1\n" +
                    "2 2\n", "10"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc203c()
        }
    }
}
