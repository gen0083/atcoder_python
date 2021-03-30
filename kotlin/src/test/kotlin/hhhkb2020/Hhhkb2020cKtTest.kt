import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Hhhkb2020cKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "1 1 0 2\n", "0\n" +
            "0\n" +
            "2\n" +
            "3\n"),
        TestData("10\n" +
            "5 4 3 2 1 0 7 7 6 6\n", "0\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "6\n" +
            "6\n" +
            "6\n" +
            "8\n" +
            "8\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            hhhkb2020c()
        }
    }
}
