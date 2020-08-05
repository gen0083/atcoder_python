import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc169dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("24", "3"),
        TestData("1", "0"),
        TestData("64", "3"),
        TestData("1000000000000", "8")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc169d()
        }
    }
}
