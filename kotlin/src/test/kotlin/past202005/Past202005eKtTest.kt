import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Past202005eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3 2 3\n" +
            "1 2\n" +
            "2 3\n" +
            "5 10 15\n" +
            "1 2\n" +
            "2 1 20\n" +
            "1 1", "10\n" +
            "10\n" +
            "20\n"),
        TestData("30 10 20\n" +
            "11 13\n" +
            "30 14\n" +
            "6 4\n" +
            "7 23\n" +
            "30 8\n" +
            "17 4\n" +
            "6 23\n" +
            "24 18\n" +
            "26 25\n" +
            "9 3\n" +
            "18 4 36 46 28 16 34 19 37 23 25 7 24 16 17 41 24 38 6 29 10 33 38 25 47 8 13 8 42 40\n" +
            "2 1 9\n" +
            "1 8\n" +
            "1 9\n" +
            "2 20 24\n" +
            "2 26 18\n" +
            "1 20\n" +
            "1 26\n" +
            "2 24 31\n" +
            "1 4\n" +
            "2 21 27\n" +
            "1 25\n" +
            "1 29\n" +
            "2 10 14\n" +
            "2 2 19\n" +
            "2 15 36\n" +
            "2 28 6\n" +
            "2 13 5\n" +
            "1 12\n" +
            "1 11\n" +
            "2 14 43", "18\n" +
            "19\n" +
            "37\n" +
            "29\n" +
            "8\n" +
            "24\n" +
            "18\n" +
            "25\n" +
            "46\n" +
            "10\n" +
            "18\n" +
            "42\n" +
            "23\n" +
            "4\n" +
            "17\n" +
            "8\n" +
            "24\n" +
            "7\n" +
            "25\n" +
            "16")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            past202005e()
        }
    }
}
