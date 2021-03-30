import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Arc111aKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("2 7\n", "0"),
        TestData("1 2\n", "1"),
        TestData("1000000000000000000 9997\n", "9015")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            arc111a()
        }
    }
}
