import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc167dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4 5\n" +
            "3 2 4 1", "4\n"),
        TestData("6 727202214173249351\n" +
            "6 5 2 5 3 2", "2\n"),
        TestData("4 5\n" +
            "2 3 4 1", "2\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc167d()
        }
    }
}
