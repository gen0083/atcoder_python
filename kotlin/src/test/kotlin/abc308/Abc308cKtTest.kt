import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc308cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
            TestData("4\n" +
                    "999999999 1000000000\n" +
                    "333333333 999999999\n" +
                    "1000000000 999999997\n" +
                    "999999998 1000000000\n", "3 1 4 2\n"),
            TestData("3\n" +
                    "1 3\n" +
                    "3 1\n" +
                    "2 2\n", "2 3 1"),
            TestData("2\n" +
                    "1 3\n" +
                    "2 6\n", "1 2"),
            TestData("""4
                |4 19
                |2 5
                |2 5
                |2 5
            """.trimMargin(), "2 3 4 1")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc308c()
        }
    }
}
