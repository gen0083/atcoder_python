import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc185cKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("12", "1"),
        TestData("13", "12"),
        TestData("17", "4368\n"),
        TestData("200", "1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc185c()
        }
    }
}
