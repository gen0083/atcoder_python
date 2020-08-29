import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc177cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "1 2 3", "11"),
        TestData("4\n" +
            "141421356 17320508 22360679 244949", "437235829")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc177c()
        }
    }
}
