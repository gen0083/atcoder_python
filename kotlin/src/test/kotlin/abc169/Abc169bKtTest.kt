import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc169bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2\n" +
            "1000000000 1000000000", "1000000000000000000\n"),
        TestData("3\n" +
            "101 9901 999999000001", "-1\n"),
        TestData("3\n100000000000000000 9999999999999999 1000000000000000000", "1000000000000"),
        TestData(
            "7\n1000000000000000000 1000000000000000000 1000000000000000000 1000000000000000000 1000000000000000000 1000000000000000000 1000000000000000000",
            "1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc169b()
        }
    }
}
