import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc205cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3 2 4\n", ">"),
        TestData("-7 7 2\n", "="),
        TestData("-8 6 3\n", "<"),
        TestData("2 3 2", "<"),
        TestData("3 2 2", ">"),
        TestData("3 -2 2", ">"),
        TestData("-2 3 2", "<"),
        TestData("2 -2 3", ">"),
        TestData("-2 2 3", "<"),
        TestData("-2 -2 3", "="),
        TestData("-2 -2 2", "=")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc205c()
        }
    }
}
