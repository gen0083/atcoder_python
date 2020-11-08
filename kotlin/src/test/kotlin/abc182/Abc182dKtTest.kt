import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc182dKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "2 -1 -2\n", "5"),
        TestData("5\n" +
            "-2 1 3 -1 -1\n", "2"),
        TestData("5\n" +
            "-1000 -1000 -1000 -1000 -1000\n", "0")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc182d()
        }
    }
}
