import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc171aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("B\n", "A"),
        TestData("a", "a")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc171a()
        }
    }
}
