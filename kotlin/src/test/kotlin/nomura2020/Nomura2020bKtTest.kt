import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Nomura2020bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("PD?D??P", "PDPDPDP\n"),
        TestData("P?P?", "PDPD")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            nomura2020b()
        }
    }
}
