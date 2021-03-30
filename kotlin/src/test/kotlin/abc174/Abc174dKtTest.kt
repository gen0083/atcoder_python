import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc174dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "WWRR", "2"),
        TestData("2\n" +
            "RR", "0"),
        TestData("8\n" +
            "WRWWRWRR", "3")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc174d()
        }
    }
}
