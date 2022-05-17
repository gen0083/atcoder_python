import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc250cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5 5\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n", "1 2 3 5 4\n")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc250c()
        }
    }
}
