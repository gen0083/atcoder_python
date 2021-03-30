import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc167bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2 1 1 3", "2\n"),
        TestData("1 2 3 4", "0\n"),
        TestData("2000000000 0 0 2000000000", "2000000000\n"),
        TestData("3 0 0 2", "2\n"),
        TestData("0 3 0 2", "0\n"),
        TestData("0 0 3 2", "-2\n"),
        TestData("1 1 1 2", "1\n"),
        TestData("1 2 0 2", "1\n"),
        TestData("1 0 2 2", "0\n"),
        TestData("0 1 2 2", "-1\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc167b()
        }
    }
}
