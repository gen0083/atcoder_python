import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc185dKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("5 2\n" +
            "1 3\n", "3"),
        TestData("5 5\n" +
            "5 2 1 4 3\n", "0"),
        TestData("1 0\n" +
            "\n", "1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc185d()
        }
    }
}
