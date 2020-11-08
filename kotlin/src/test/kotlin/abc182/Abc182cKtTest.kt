import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc182cKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("35", "1"),
        TestData("369", "0"),
        TestData("6227384\n", "1"),
        TestData("11", "-1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc182c()
        }
    }
}
