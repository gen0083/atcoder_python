import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc176eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2 3 3\n" +
            "2 2\n" +
            "1 1\n" +
            "1 3", "3"),
        TestData("3 3 4\n" +
            "3 3\n" +
            "3 1\n" +
            "1 1\n" +
            "1 2", "3"),
        TestData("5 5 10\n" +
            "2 5\n" +
            "4 3\n" +
            "2 3\n" +
            "5 5\n" +
            "2 2\n" +
            "5 4\n" +
            "5 3\n" +
            "5 1\n" +
            "3 5\n" +
            "1 4", "6"),
        TestData("""3 3 9
            |1 1
            |1 2
            |1 3
            |2 1
            |2 2
            |2 3
            |3 1
            |3 2
            |3 3
        """.trimMargin(), "9")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc176e()
        }
    }
}
