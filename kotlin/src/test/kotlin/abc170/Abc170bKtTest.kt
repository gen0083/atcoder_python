import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc170bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3 8", "Yes\n"),
        TestData("2 100", "No\n"),
        TestData("1 2", "Yes\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc170b()
        }
    }
}
