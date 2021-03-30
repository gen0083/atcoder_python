import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Heroes4cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("6\n" +
            "5 4 3 5\n" +
            "1 2 2 3 5\n" +
            "5 3 4 5\n" +
            "1 5 1 5 5\n" +
            "5 4 5 6\n" +
            "1 2 5 3 5\n" +
            "4 3 2 10\n" +
            "4 4 1 1\n" +
            "4 3 10 2\n" +
            "4 4 1 1\n" +
            "4 1 5 4\n" +
            "1 2 1 3\n", "3\n" +
            "9\n" +
            "6\n" +
            "4\n" +
            "2\n" +
            "9\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            heroes4c()
        }
    }
}
