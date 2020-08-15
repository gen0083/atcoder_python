import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc175cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("6 2 4", "2"),
        TestData("7 4 3", "1"),
        TestData("10 1 2", "8"),
        TestData("1000000000000000 1000000000000000 1000000000000000", "1000000000000000\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc175c()
        }
    }
}
