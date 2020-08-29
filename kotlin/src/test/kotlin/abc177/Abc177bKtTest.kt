import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc177bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("cabacc\n" +
            "abc", "1"),
        TestData("codeforces\n" +
            "atcoder", "6")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc177b()
        }
    }
}
