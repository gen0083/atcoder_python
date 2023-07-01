import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc308dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
            TestData("2 3\n" +
                    "sns\n" +
                    "euk\n", "Yes"),
            TestData("2 2\n" +
                    "ab\n" +
                    "cd\n", "No"),
            TestData("5 7\n" +
                    "skunsek\n" +
                    "nukesnu\n" +
                    "ukeseku\n" +
                    "nsnnesn\n" +
                    "uekukku\n", "Yes"),
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc308d()
        }
    }
}
