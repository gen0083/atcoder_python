import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc172aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2", "14\n"),
        TestData("10", "1110")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc172a()
        }
    }
}
