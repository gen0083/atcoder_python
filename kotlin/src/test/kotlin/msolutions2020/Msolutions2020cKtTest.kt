import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Msolutions2020cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5 3\n" +
            "96 98 95 100 20", "Yes\n" +
            "No\n"),
        TestData("3 2\n" +
            "1001 869120 1001", "No\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            msolutions2020c()
        }
    }
}
