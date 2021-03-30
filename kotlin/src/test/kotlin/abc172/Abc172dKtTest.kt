import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc172dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4", "23"),
        TestData("100", "26879"),
        TestData("10000000", "838627288460105\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc172d()
        }
    }
}
