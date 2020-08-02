import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc174cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("101", "4"),
        TestData("2", "-1"),
        TestData("999983", "999982")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc174c()
        }
    }
}
