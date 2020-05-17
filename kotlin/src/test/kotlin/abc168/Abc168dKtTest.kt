import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc168dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4 4\n" +
            "1 2\n" +
            "2 3\n" +
            "3 4\n" +
            "4 2", "Yes\n" +
            "1\n" +
            "2\n" +
            "2\n"),
        TestData("6 9\n" +
            "3 4\n" +
            "6 1\n" +
            "2 4\n" +
            "5 3\n" +
            "4 6\n" +
            "1 5\n" +
            "6 2\n" +
            "4 5\n" +
            "5 6", "Yes\n" +
            "6\n" +
            "5\n" +
            "5\n" +
            "1\n" +
            "1\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc168d()
        }
    }
}
