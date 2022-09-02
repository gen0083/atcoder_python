import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc266dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
            TestData(
                    "3\n" +
                            "1 0 100\n" +
                            "3 3 10\n" +
                            "5 4 1\n", "101"
            ),
            TestData(
                    "3\n" +
                            "1 4 1\n" +
                            "2 4 1\n" +
                            "3 4 1\n", "0"
            ),
            TestData(
                    "10\n" +
                            "1 4 602436426\n" +
                            "2 1 623690081\n" +
                            "3 3 262703497\n" +
                            "4 4 628894325\n" +
                            "5 3 450968417\n" +
                            "6 1 161735902\n" +
                            "7 1 707723857\n" +
                            "8 2 802329211\n" +
                            "9 0 317063340\n" +
                            "10 2 125660016\n", "2978279323\n"
            )
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc266d()
        }
    }
}
