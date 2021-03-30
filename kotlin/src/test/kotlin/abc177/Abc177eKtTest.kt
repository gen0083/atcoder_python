import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc177eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "3 4 5", "pairwise coprime\n"),
        TestData("3\n" +
            "6 10 15", "setwise coprime\n"),
        TestData("3\n" +
            "6 10 16", "not coprime\n"),
        TestData("1000000\n1000000${buildString { repeat(999999) { append(" 1000000") } }}",
            "not coprime"),
        TestData("5\n2 3 6 11 9", "setwise coprime"),
        TestData("2\n15 25", "not coprime"),
        TestData("3\n1 2 3", "pairwise coprime"),
        TestData("3\n1 2 4", "setwise coprime")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc177e()
        }
    }
}
