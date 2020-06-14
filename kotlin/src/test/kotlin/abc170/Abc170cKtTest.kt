import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc170cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("6 5\n" +
            "4 7 10 6 5", "8\n"),
        TestData("10 5\n" +
            "4 7 10 6 5", "9\n"),
        TestData("100 0\n", "100\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc170c()
        }
    }
}
