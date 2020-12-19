import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc186cKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("20", "17"),
        TestData("100000\n", "30555\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc186c()
        }
    }
}
