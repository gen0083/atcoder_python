import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc173dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "2 2 1 3", "7\n"),
        TestData("7\n" +
            "1 1 1 1 1 1 1", "6"),
        TestData("6\n10 5 5 8 4 1", "36")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc173d()
        }
    }
}
