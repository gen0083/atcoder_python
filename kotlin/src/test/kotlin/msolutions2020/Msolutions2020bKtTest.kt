import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Msolutions2020bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("7 2 5\n" +
            "3", "Yes\n"),
        TestData("7 4 2\n" +
            "3", "No\n"),
        TestData("1 2 3\n1", "Yes"),
        TestData("7 1 3\n5", "Yes")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            msolutions2020b()
        }
    }
}
