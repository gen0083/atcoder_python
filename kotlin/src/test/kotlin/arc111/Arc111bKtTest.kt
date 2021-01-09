import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class Arc111bKtTest : TestBase() {
    
    override val testData: List<TestData> = listOf(
        TestData("4\n" +
            "1 2\n" +
            "1 3\n" +
            "4 2\n" +
            "2 3\n", "4"),
        TestData("2\n" +
            "111 111\n" +
            "111 111\n", "1"),
        TestData("12\n" +
            "5 2\n" +
            "5 6\n" +
            "1 2\n" +
            "9 7\n" +
            "2 7\n" +
            "5 5\n" +
            "4 2\n" +
            "6 7\n" +
            "2 2\n" +
            "7 8\n" +
            "9 7\n" +
            "1 8\n", "8"),
        TestData("2\n1 2\n3 4", "2"),
        TestData("4\n1 3\n2 2\n2 2\n2 2", "2")
    )
    
    @ParameterizedTest
    @MethodSource("generateTestData")
    fun `テストケース`(testData: TestData) {
        intoBox(testData) {
            arc111b()
        }
    }
}
