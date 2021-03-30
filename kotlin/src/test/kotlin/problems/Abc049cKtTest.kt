import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc049cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("erasedream", "YES\n"),
        TestData("dreameraser", "YES\n"),
        TestData("dreamerer", "NO\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc049c()
        }
    }
}