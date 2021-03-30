import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc181dKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("1234", "Yes"),
        TestData("1333\n", "No"),
        TestData("8", "Yes")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc181d()
        }
    }
}
