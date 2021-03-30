import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Arc109aKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("2 1 1 5\n", "1"),
        TestData("1 2 100 1\n", "101"),
        TestData("1 100 1 100\n", "199"),
        TestData("100 98 5 1", "11")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            arc109a()
        }
    }
}
