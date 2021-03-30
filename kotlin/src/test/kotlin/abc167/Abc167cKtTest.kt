import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc167cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3 3 10\n" +
            "60 2 2 4\n" +
            "70 8 7 9\n" +
            "50 2 3 9", "120\n"),
        TestData("3 3 10\n" +
            "100 3 1 4\n" +
            "100 1 5 9\n" +
            "100 2 6 5", "-1\n"),
        TestData("8 5 22\n" +
            "100 3 7 5 3 1\n" +
            "164 4 5 2 7 8\n" +
            "334 7 2 7 2 9\n" +
            "234 4 7 2 8 2\n" +
            "541 5 4 3 3 6\n" +
            "235 4 8 6 9 7\n" +
            "394 3 6 1 6 2\n" +
            "872 8 4 3 7 2", "1067\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc167c()
        }
    }
}
