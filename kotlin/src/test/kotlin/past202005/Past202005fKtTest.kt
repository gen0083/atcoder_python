import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Past202005fKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2\n" +
            "yc\n" +
            "ys", "yy"),
        TestData("2\n" +
            "rv\n" +
            "jh", "-1")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            past202005f()
        }
    }
}
