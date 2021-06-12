import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Arc122aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "3\n" +
                    "3 1 5\n", "15"
        ),
        TestData(
            "4\n" +
                    "1 1 1 1\n", "10"
        ),
        TestData(
            "10\n" +
                    "866111664 178537096 844917655 218662351 383133839 231371336 353498483 865935868 472381277 579910117\n",
            "279919144\n"
        ),
        TestData(
            "5\n" +
                    "1 1 1 1 1", "20"
        ),
        TestData(
            "6\n" +
                    "1 1 1 1 1 1", "30"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            arc122a()
        }
    }
}
