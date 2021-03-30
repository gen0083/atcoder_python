import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc172cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3 4 240\n" +
            "60 90 120\n" +
            "80 150 80 150", "3\n"),
        TestData("3 4 730\n" +
            "60 90 120\n" +
            "80 150 80 150", "7"),
        TestData("5 4 1\n" +
            "1000000000 1000000000 1000000000 1000000000 1000000000\n" +
            "1000000000 1000000000 1000000000 1000000000", "0\n"),
        TestData("4 4 150\n" +
            "100 1 1 1\n" +
            "50 50 50 50", "4"),
        TestData("""4 4 100000
10 10 10 10
10 10 10 10""", "8")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc172c()
        }
    }
}
