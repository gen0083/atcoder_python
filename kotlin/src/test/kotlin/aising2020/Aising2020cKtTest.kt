import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Aising2020cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("20", "0\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "1\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "3\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "0\n" +
            "3\n" +
            "3\n" +
            "0\n" +
            "0\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            aising2020c()
        }
    }
}
