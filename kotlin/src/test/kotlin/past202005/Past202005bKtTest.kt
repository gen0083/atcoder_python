import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Past202005bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2 1 6\n" +
            "2 1 1\n" +
            "1 1\n" +
            "1 2\n" +
            "2 2 1\n" +
            "1 1\n" +
            "1 2", "1\n" +
            "0\n" +
            "0\n" +
            "0\n"),
        TestData("5 5 30\n" +
            "1 3\n" +
            "2 3 5\n" +
            "1 3\n" +
            "2 2 1\n" +
            "2 4 5\n" +
            "2 5 2\n" +
            "2 2 3\n" +
            "1 4\n" +
            "2 4 1\n" +
            "2 2 2\n" +
            "1 1\n" +
            "1 5\n" +
            "2 5 3\n" +
            "2 4 4\n" +
            "1 4\n" +
            "1 2\n" +
            "2 3 3\n" +
            "2 4 3\n" +
            "1 3\n" +
            "1 5\n" +
            "1 3\n" +
            "2 1 3\n" +
            "1 1\n" +
            "2 2 4\n" +
            "1 1\n" +
            "1 4\n" +
            "1 5\n" +
            "1 4\n" +
            "1 1\n" +
            "1 5", "0\n" +
            "4\n" +
            "3\n" +
            "0\n" +
            "3\n" +
            "10\n" +
            "9\n" +
            "4\n" +
            "4\n" +
            "4\n" +
            "0\n" +
            "0\n" +
            "9\n" +
            "3\n" +
            "9\n" +
            "0\n" +
            "3")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            past202005b()
        }
    }
}
