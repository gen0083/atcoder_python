import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc280cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "atcoder\natcorder\n", "5"
        ),
        TestData(
            "million\n" +
                    "milllion\n", "5"
        ),
        TestData(
            "vvwvw\n" +
                    "vvvwvw\n", "3"
        ),
        TestData("mmm\nmmmm\n", "4"),
        TestData("abc\nabcd\n", "4")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc280c()
        }
    }
}
