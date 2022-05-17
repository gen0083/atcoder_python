import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc250bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("4 3 2", "..##..##\n" +
                "..##..##\n" +
                "..##..##\n" +
                "##..##..\n" +
                "##..##..\n" +
                "##..##..\n" +
                "..##..##\n" +
                "..##..##\n" +
                "..##..##\n" +
                "##..##..\n" +
                "##..##..\n" +
                "##..##..\n")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc250b()
        }
    }
}
