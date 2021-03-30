import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Heroes4aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "40 3\n" +
            "1200 7\n" +
            "320802005 400\n" +
            "4 1\n", "1 3 9 27\n" +
            "3 21 147 1029\n" +
            "5 2000 800000 320000000\n" +
            "1 1 1 1\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            heroes4a()
        }
    }
}
