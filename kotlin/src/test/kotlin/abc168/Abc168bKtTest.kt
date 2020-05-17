import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Abc168bKtTest : TestBase() {
    override val testData: List<TestData> = listOf(
        TestData("7\n" +
            "nikoandsolstice", "nikoand...\n"),
        TestData("40\n" +
            "ferelibenterhominesidquodvoluntcredunt", "ferelibenterhominesidquodvoluntcredunt\n")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            abc168b()
        }
    }
}
