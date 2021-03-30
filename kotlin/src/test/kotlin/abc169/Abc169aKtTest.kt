import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc169aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2 5", "10\n"),
        TestData("100 100", "10000")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc169a()
        }
    }
}
