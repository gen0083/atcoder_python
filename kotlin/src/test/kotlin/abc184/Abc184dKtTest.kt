import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc184dKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("99 99 99\n", "1.000000000\n"),
        TestData("98 99 99\n", "1.331081081\n"),
        TestData("0 0 1\n", "99.000000000\n"),
        TestData("31 41 59\n", "91.835008202\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc184d()
        }
    }
}
