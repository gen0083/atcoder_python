import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc306dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "5\n" +
                "1 100\n" +
                "1 300\n" +
                "0 -200\n" +
                "1 500\n" +
                "1 300\n", "600\n"
        ),
        TestData(
            "4\n" +
                "0 -1\n" +
                "1 -2\n" +
                "0 -3\n" +
                "1 -4\n", "0"
        ),
        TestData(
            "15\n" +
                "1 900000000\n" +
                "0 600000000\n" +
                "1 -300000000\n" +
                "0 -700000000\n" +
                "1 200000000\n" +
                "1 300000000\n" +
                "0 -600000000\n" +
                "1 -900000000\n" +
                "1 600000000\n" +
                "1 -100000000\n" +
                "1 -400000000\n" +
                "0 900000000\n" +
                "0 200000000\n" +
                "1 -500000000\n" +
                "1 900000000\n", "4100000000\n"
        )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc306d()
        }
    }
}
