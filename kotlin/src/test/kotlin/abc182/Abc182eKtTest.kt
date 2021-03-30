import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc182eKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("3 3 2 1\n" +
            "1 1\n" +
            "2 3\n" +
            "2 2\n", "7"),
        TestData("4 4 3 3\n" +
            "1 2\n" +
            "1 3\n" +
            "3 4\n" +
            "2 3\n" +
            "2 4\n" +
            "3 2\n", "8"),
        TestData("5 5 5 1\n" +
            "1 1\n" +
            "2 2\n" +
            "3 3\n" +
            "4 4\n" +
            "5 5\n" +
            "4 2\n", "24")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc182e()
        }
    }
}
