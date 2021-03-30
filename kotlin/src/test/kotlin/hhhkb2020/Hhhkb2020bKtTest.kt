import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Hhhkb2020bKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("2 3\n" +
            "..#\n" +
            "#..\n", "3"),
        TestData("2 2\n" +
            ".#\n" +
            "#.\n", "0")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            hhhkb2020b()
        }
    }
}
