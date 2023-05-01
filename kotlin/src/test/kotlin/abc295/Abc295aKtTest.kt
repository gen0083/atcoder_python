import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc295aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "10\n" +
                    "in that case you should print yes and not no\n", "Yes\n"
        ),
        TestData(
            "10\n" +
                    "in diesem fall sollten sie no und nicht yes ausgeben\n", "No\n"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc295a()
        }
    }
}
