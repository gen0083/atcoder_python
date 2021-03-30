import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Past202005cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2 3 4", "54\n"),
        TestData("4 3 21", "large\n"),
        TestData("12 34 5", "16036032"),
        TestData("1000000000 1000000000 1000000000", "large")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            past202005c()
        }
    }
}
