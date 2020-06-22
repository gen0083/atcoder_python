import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Agc046aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("90", "4"),
        TestData("1", "360")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            agc046a()
        }
    }
}
