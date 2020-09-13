import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc178cKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("2", "2"),
        TestData("1", "0"),
        TestData("869121", "2511445"),
        TestData("3", "60"),
        TestData("4", "1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc178c()
        }
    }
}
