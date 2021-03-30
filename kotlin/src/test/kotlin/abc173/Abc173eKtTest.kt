import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc173eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4 2\n" +
            "1 2 -3 -4", "12\n"),
        TestData("4 3\n" +
            "-1 -2 -3 -4", "1000000001\n"),
        TestData("2 1\n" +
            "-1 1000000000", "1000000000\n"),
        TestData("10 10\n" +
            "1000000000 100000000 10000000 1000000 100000 10000 1000 100 10 1", "999983200\n"),
        TestData("6 5\n-10 -30 -50 -80 30 50", "60000000"),
        TestData("6 3\n-1 -2 -3 0 0 0", "0"),
        TestData("5 3\n40 10 5 -10 -8 -6", "3200"),
        TestData("6 3\n6 6 8 -5 -5 -7", "288"),
        TestData("6 1\n10 8 -3 4 0", "10")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc173e()
        }
    }
}
