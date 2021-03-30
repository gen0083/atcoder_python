import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc185aKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("", "")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc185a()
        }
    }
}
