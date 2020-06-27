import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc172bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("cupofcoffee\n" +
            "cupofhottea", "4\n"),
        TestData("abcde\n" +
            "bcdea", "5"),
        TestData("apple\n" +
            "apple", "0\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc172b()
        }
    }
}
