import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Aising2020dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "011", "2\n" +
            "1\n" +
            "1\n"),
        TestData("23\n" +
            "00110111001011011001110", "2\n" +
            "1\n" +
            "2\n" +
            "2\n" +
            "1\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "2\n" +
            "1\n" +
            "3"),
        TestData("200000\n${"10".repeat(100000)}", "a")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            aising2020d()
        }
    }
}
