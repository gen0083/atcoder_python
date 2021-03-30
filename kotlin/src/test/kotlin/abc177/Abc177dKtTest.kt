import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc177dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5 3\n" +
            "1 2\n" +
            "3 4\n" +
            "5 1", "3"),
        TestData("4 10\n" +
            "1 2\n" +
            "2 1\n" +
            "1 2\n" +
            "2 1\n" +
            "1 2\n" +
            "1 3\n" +
            "1 4\n" +
            "2 3\n" +
            "2 4\n" +
            "3 4", "4"),
        TestData("10 4\n" +
            "3 1\n" +
            "4 1\n" +
            "5 9\n" +
            "2 6", "3")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc177d()
        }
    }
}
