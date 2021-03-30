import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc186eKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "10 4 3\n" +
            "1000 11 2\n" +
            "998244353 897581057 595591169\n" +
            "10000 6 14\n", "2\n" +
            "-1\n" +
            "249561088\n" +
            "3571\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc186e()
        }
    }
}
