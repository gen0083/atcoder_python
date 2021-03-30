import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Msolutions2020aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("725", "7\n"),
        TestData("1600", "2")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            msolutions2020a()
        }
    }
}
