import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Tokiomarine2020aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("takahashi", "tak"),
        TestData("naohiro", "nao")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            tokiomarine2020a()
        }
    }
}
