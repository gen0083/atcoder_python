import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Arc107bKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("2 1", "4"),
        TestData("2525 -425\n", "10314607400\n"),
        TestData("100000 -199998", "1"),
        TestData("100000 199998", "1"),
        TestData("100000 0", "1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            arc107b()
        }
    }
}
