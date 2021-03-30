import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Hhhkb2020dKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("3\n" +
            "3 1 2\n" +
            "4 2 2\n" +
            "331895368 154715807 13941326\n", "20\n" +
            "32\n" +
            "409369707\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            hhhkb2020d()
        }
    }
}
