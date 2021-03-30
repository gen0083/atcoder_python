import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc173aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("1900", "100\n"),
        TestData("3000", "0\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc173a()
        }
    }
}
