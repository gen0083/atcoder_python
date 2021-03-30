import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc184cKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("1 1\n" +
            "5 6\n", "2"),
        TestData("1 1\n" +
            "1 200001\n", "2"),
        TestData("2 3\n" +
            "998244353 998244853\n", "3"),
        TestData("1 1\n" +
            "1 1\n", "0")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc184c()
        }
    }
}
