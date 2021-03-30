import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc175bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5\n" +
            "4 4 9 7 5", "5"),
        TestData("6\n" +
            "4 5 4 3 3 5", "8"),
        TestData("10\n" +
            "9 4 6 1 9 6 10 6 6 8", "39"),
        TestData("2\n" +
            "1 1", "0")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc175b()
        }
    }
}
