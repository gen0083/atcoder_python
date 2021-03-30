import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc169cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("198 1.10", "217\n"),
        TestData("1 0.01", "0"),
        TestData("1000000000000000 9.99", "9990000000000000"),
        TestData("1000000000000000 10.12", "11"),
        TestData("0 0.12", "0")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc169c()
        }
    }
}
