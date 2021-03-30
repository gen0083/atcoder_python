import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Arc107aKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("1 2 3\n", "18"),
        TestData("1000000000 987654321 123456789\n", "951633476\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            arc107a()
        }
    }
}
