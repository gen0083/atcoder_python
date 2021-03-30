import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Heroes4bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "4 5 7\n" +
            "1011\n" +
            "4 4 10\n" +
            "0101\n" +
            "5 3 4\n" +
            "11011\n" +
            "6 4 6\n" +
            "011101\n", "12\n" +
            "8\n" +
            "8\n" +
            "14\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            heroes4b()
        }
    }
}
