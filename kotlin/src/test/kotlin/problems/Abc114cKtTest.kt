import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import java.util.*

class Abc114cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("575", "4\n"),
            TestData("3600", "13\n"),
            TestData("999999999", "26484"),
            TestData("3100", "6"),
            TestData("402", "2")
        )
    
    override fun callTestTarget() {
        abc114c()
    }
    
    @Test
    fun hoge() {
        val set = BitSet(6)
        println(set.flip(1))
        set shouldBe 3
    }
}