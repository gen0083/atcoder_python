import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc280dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("30", "5"),
        TestData("123456789011\n", "123456789011\n"),
        TestData("280\n", "7"),
        TestData("24\n", "4"),
        TestData("48", "6")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc280d()
        }
    }
}
