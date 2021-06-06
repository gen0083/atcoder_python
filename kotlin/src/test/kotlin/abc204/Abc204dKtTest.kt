import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc204dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "5\n" +
                    "8 3 7 2 5\n", "13"
        ),
        TestData(
            "2\n" +
                    "1000 1\n", "1000"
        ),
        TestData(
            "9\n" +
                    "3 14 15 9 26 5 35 89 79\n", "138"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc204d()
        }
    }
}
