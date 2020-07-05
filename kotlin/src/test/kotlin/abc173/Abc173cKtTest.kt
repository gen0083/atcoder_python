import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc173cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2 3 2\n" +
            "..#\n" +
            "###", "5"),
        TestData("2 3 4\n" +
            "..#\n" +
            "###", "1\n"),
        TestData("2 2 3\n" +
            "##\n" +
            "##", "0"),
        TestData("6 6 8\n" +
            "..##..\n" +
            ".#..#.\n" +
            "#....#\n" +
            "######\n" +
            "#....#\n" +
            "#....#", "208")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc173c()
        }
    }
}
