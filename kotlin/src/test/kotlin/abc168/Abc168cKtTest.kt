import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc168cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3 4 9 0", "5.00000000000000000000\n"),
        TestData("3 4 10 40", "4.56425719433005567605\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc168c()
        }
    }
}
