import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Tokiomarine2020cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5 1\n" +
            "1 0 0 1 0", "1 2 2 1 2 \n"),
        TestData("5 2\n" +
            "1 0 0 1 0", "3 3 4 4 3 \n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            tokiomarine2020c()
        }
    }
}
