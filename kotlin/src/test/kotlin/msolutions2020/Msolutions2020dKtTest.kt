import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Msolutions2020dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("7\n" +
            "100 130 130 130 115 115 150", "1685\n"),
        TestData("6\n" +
            "200 180 160 140 120 100", "1000\n"),
        TestData("2\n" +
            "157 193", "1216\n"),
        TestData("10\n1 2 1 1 2 1 1 2 1 1", "")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            msolutions2020d()
        }
    }
}
