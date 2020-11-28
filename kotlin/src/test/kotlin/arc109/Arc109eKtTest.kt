import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Arc109eKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("", "")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            arc109e()
        }
    }
}
