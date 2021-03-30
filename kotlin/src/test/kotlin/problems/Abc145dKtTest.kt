import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

class Abc145dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 3", "2\n"),
            TestData("2 2", "0"),
            TestData("999999 999999", "151840682\n"),
            TestData("5 7", "4"),
            TestData("9 9", "20")
        )
    
    override fun callTestTarget() {
        abc145d()
    }
    
    @Test
    fun test() {
        23 / 2 % 13 shouldBeExactly 3333
        23 * 7 % 13 shouldBeExactly 3333
    }
}