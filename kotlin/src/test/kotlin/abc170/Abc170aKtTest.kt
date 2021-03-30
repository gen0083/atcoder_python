import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc170aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("0 2 3 4 5", "1"),
        TestData("1 2 0 4 5", "3")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc170a()
        }
    }
}
