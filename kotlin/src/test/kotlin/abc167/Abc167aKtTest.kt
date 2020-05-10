import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc167aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("chokudai\n" +
            "chokudaiz", "Yes\n"),
        TestData("snuke\n" +
            "snekee", "No\n"),
        TestData("a\n" +
            "aa", "Yes\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc167a()
        }
    }
}
