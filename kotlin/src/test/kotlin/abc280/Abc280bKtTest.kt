import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc280bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData(
            "3\n" +
                    "3 4 8\n", "3 1 4"
        ),
        TestData(
            "10\n" +
                    "314159265 358979323 846264338 -327950288 419716939 -937510582 97494459 230781640 628620899 -862803482\n",
            "314159265 44820058 487285015 -1174214626 747667227 -1357227521 1035005041 133287181 397839259 -1491424381\n"
        ),
        TestData("1\n4", "4")
    )

    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc280b()
        }
    }
}
