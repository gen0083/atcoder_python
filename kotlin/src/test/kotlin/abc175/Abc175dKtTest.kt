import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc175dKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("5 2\n" +
            "2 4 5 1 3\n" +
            "3 4 -10 -8 8", "8"),
        TestData("2 3\n" +
            "2 1\n" +
            "10 -7", "13"),
        TestData("3 3\n" +
            "3 1 2\n" +
            "-1000 -2000 -3000", "-1000"),
        TestData("10 58\n" +
            "9 1 6 7 8 4 3 2 10 5\n" +
            "695279662 988782657 -119067776 382975538 -151885171 -177220596 -169777795 37619092 389386780 980092719",
            "29507023469\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc175d()
        }
    }
}
