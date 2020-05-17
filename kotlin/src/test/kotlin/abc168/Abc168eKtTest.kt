import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc168eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "1 2\n" +
            "-1 1\n" +
            "2 -1", "5\n"),
        TestData("10\n" +
            "3 2\n" +
            "3 2\n" +
            "-1 1\n" +
            "2 -1\n" +
            "-3 -9\n" +
            "-8 12\n" +
            "7 7\n" +
            "8 1\n" +
            "8 2\n" +
            "8 4", "479")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc168e()
        }
    }
}
