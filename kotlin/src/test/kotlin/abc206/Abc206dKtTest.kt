import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc206dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "8\n" +
                    "1 5 3 2 5 2 3 1\n", "2"
        ),
        TestData(
            "7\n" +
                    "1 2 3 4 1 2 3\n", "1"
        ),
        TestData(
            "1\n" +
                    "200000\n", "0"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc206d()
        }
    }
}
