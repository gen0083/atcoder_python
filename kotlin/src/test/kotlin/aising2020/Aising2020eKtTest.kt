import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Aising2020eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "2\n" +
            "1 5 10\n" +
            "2 15 5\n" +
            "3\n" +
            "2 93 78\n" +
            "1 71 59\n" +
            "3 57 96\n" +
            "19\n" +
            "19 23 16\n" +
            "5 90 13\n" +
            "12 85 70\n" +
            "19 67 78\n" +
            "12 16 60\n" +
            "18 48 28\n" +
            "5 4 24\n" +
            "12 97 97\n" +
            "4 57 87\n" +
            "19 91 74\n" +
            "18 100 76\n" +
            "7 86 46\n" +
            "9 100 57\n" +
            "3 76 73\n" +
            "6 84 93\n" +
            "1 6 84\n" +
            "11 75 94\n" +
            "19 15 3\n" +
            "12 11 34", "25\n" +
            "221\n" +
            "1354\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            aising2020e()
        }
    }
}
