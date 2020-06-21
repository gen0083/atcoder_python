import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc171dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "1 2 3 4\n" +
            "3\n" +
            "1 2\n" +
            "3 4\n" +
            "2 4", "11\n" +
            "12\n" +
            "16\n"),
        TestData("4\n" +
            "1 1 1 1\n" +
            "3\n" +
            "1 2\n" +
            "2 1\n" +
            "3 5", "8\n" +
            "4\n" +
            "4\n"),
        TestData("2\n" +
            "1 2\n" +
            "3\n" +
            "1 100\n" +
            "2 100\n" +
            "100 1000", "102\n" +
            "200\n" +
            "2000")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc171d()
        }
    }
}
