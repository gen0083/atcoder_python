import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc171bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5 3\n" +
            "50 100 80 120 80", "210\n"),
        TestData("1 1\n" +
            "1000", "1000")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc171b()
        }
    }
}
