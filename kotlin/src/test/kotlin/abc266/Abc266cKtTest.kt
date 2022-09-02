import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc266cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
            TestData(
                    "0 0\n" +
                            "1 0\n" +
                            "1 1\n" +
                            "0 1\n", "Yes\n"
            ),
            TestData(
                    "0 0\n" +
                            "1 1\n" +
                            "-1 0\n" +
                            "1 -1\n", "No"
            )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc266c()
        }
    }
}
