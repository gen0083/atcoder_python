import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc178bKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("1 2 1 1", "2"),
        TestData("3 5 -4 -2", "-6")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc178b()
        }
    }
}
