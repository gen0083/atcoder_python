import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Past202005aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("AbC\n" +
            "ABc", "case-insensitive\n"),
        TestData("xyz\n" +
            "xyz", "same\n"),
        TestData("aDs\n" +
            "kjH", "different")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            past202005a()
        }
    }
}
