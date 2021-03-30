import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Tokiomarine2020bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("1 2\n" +
            "3 1\n" +
            "3", "YES\n"),
        TestData("1 2\n" +
            "3 2\n" +
            "3", "NO\n"),
        TestData("1 2\n" +
            "3 3\n" +
            "3", "NO\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            tokiomarine2020b()
        }
    }
}
