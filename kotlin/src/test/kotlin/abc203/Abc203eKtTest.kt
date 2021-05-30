import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc203eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("", "")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc203e()
        }
    }
}
