import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc308bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
            TestData("3 2\n" +
                    "red green blue\n" +
                    "blue red\n" +
                    "800 1600 2800\n", "5200")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc308b()
        }
    }
}
