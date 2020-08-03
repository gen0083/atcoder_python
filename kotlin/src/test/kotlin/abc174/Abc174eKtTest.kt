import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc174eKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("3 0\n" +
            "3 4 5", "5"),
        TestData("2 3\n" +
            "7 9", "4"),
        TestData("10 10\n" +
            "158260522 877914575 602436426 24979445 861648772 623690081 433933447 476190629 262703497 211047202",
            "292638192")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc174e()
        }
    }
}
