import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc170dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5\n" +
            "24 11 8 3 16", "3\n"),
        TestData("4\n" +
            "5 5 5 5", "0\n"),
        TestData("10\n" +
            "33 18 45 28 8 19 89 86 2 4", "5")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc170d()
        }
    }
}
