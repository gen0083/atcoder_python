import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc206aKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("180\n", "Yay!\n"),
        TestData("200\n", ":(\n"),
        TestData("191\n", "so-so\n")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc206a()
        }
    }
}
