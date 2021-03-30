import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Aising2020bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5\n" +
            "1 3 4 5 7", "2\n"),
        TestData("15\n" +
            "13 76 46 15 50 98 93 77 31 43 84 90 6 24 14", "3")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            aising2020b()
        }
    }
}
