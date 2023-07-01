import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc308dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
            TestData("2 3\n" +
                    "sns\n" +
                    "euk\n", "Yes")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc308d()
        }
    }
}
