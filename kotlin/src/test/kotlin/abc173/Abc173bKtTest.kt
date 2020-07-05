import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc173bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("6\n" +
            "AC\n" +
            "TLE\n" +
            "AC\n" +
            "AC\n" +
            "WA\n" +
            "TLE", "AC x 3\n" +
            "WA x 1\n" +
            "TLE x 2\n" +
            "RE x 0\n"),
        TestData("10\n" +
            "AC\n" +
            "AC\n" +
            "AC\n" +
            "AC\n" +
            "AC\n" +
            "AC\n" +
            "AC\n" +
            "AC\n" +
            "AC\n" +
            "AC", "AC x 10\n" +
            "WA x 0\n" +
            "TLE x 0\n" +
            "RE x 0")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc173b()
        }
    }
}
