import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Agc044aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5\n" +
            "11 1 2 4 8\n" +
            "11 1 2 2 8\n" +
            "32 10 8 5 4\n" +
            "29384293847243 454353412 332423423 934923490 1\n" +
            "900000000000000000 332423423 454353412 934923490 987654321", "20\n" +
            "19\n" +
            "26\n" +
            "3821859835\n" +
            "23441258666\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            agc044a()
        }
    }
}
