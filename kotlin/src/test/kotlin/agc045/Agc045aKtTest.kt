import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Agc045aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "2\n" +
            "1 2\n" +
            "10\n" +
            "2\n" +
            "1 1\n" +
            "10\n" +
            "6\n" +
            "2 3 4 5 6 7\n" +
            "111000", "1\n" +
            "0\n" +
            "0\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            agc045a()
        }
    }
}
