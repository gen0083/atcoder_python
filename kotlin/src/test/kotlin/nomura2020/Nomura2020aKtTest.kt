import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Nomura2020aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("10 0 15 0 30", "270\n"),
        TestData("10 0 12 0 120", "0\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            nomura2020a()
        }
    }
}
