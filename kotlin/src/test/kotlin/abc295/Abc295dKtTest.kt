import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc295dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("20230322\n", "4\n"),
        TestData("0112223333444445555556666666777777778888888889999999999\n", "185\n"),
        TestData("3141592653589793238462643383279502884197169399375105820974944\n", "9\n")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc295d()
        }
    }
}
