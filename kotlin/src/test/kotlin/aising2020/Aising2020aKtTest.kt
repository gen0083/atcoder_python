import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Aising2020aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5 10 2", "3"),
        TestData("6 20 7", "2"),
        TestData("1 100 1", "100")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            aising2020a()
        }
    }
}
