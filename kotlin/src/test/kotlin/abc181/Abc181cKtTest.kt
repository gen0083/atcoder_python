import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc181cKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "0 1\n" +
            "0 2\n" +
            "0 3\n" +
            "1 1\n", "Yes"),
        TestData("14\n" +
            "5 5\n" +
            "0 1\n" +
            "2 5\n" +
            "8 0\n" +
            "2 1\n" +
            "0 0\n" +
            "3 6\n" +
            "8 6\n" +
            "5 9\n" +
            "7 9\n" +
            "3 4\n" +
            "9 2\n" +
            "9 8\n" +
            "7 2\n", "Yes"),
        TestData("9\n" +
            "8 2\n" +
            "2 3\n" +
            "1 3\n" +
            "3 7\n" +
            "1 0\n" +
            "8 8\n" +
            "5 6\n" +
            "9 7\n" +
            "0 1\n", "Yes")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc181c()
        }
    }
}
