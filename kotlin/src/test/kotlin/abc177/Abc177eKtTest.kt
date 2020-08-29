import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc177eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "3 4 5", "pairwise coprime\n"),
        TestData("3\n" +
            "6 10 15", "setwise coprime\n"),
        TestData("3\n" +
            "6 10 16", "not coprime\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc177e()
        }
    }
}
