import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Nomura2020cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "0 1 1 2", "7\n"),
        TestData("4\n" +
            "0 0 1 0 2", "10"),
        TestData("2\n" +
            "0 3 1", "-1"),
        TestData("1\n" +
            "1 1", "-1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            nomura2020c()
        }
    }
}
