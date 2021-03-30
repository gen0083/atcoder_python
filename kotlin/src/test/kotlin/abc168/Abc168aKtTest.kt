import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc168aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("16", "pon"),
        TestData("2", "hon"),
        TestData("183", "bon")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc168a()
        }
    }
}
