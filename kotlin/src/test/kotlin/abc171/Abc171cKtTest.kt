import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc171cKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("2", "b"),
        TestData("27", "aa"),
        TestData("123456789", "jjddja"),
        TestData("475255", "aaaaa"),
        TestData("18278", "zzz")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc171c()
        }
    }
}
