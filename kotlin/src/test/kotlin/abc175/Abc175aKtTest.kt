import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc175aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("RRS", "2"),
        TestData("SSS", "0"),
        TestData("RSR", "1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc175a()
        }
    }
}
