import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Abc197cKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "3\n" +
                        "1 5 7\n", "2"
            ),
            TestData(
                "3\n" +
                        "10 10 10", "0"
            ),
            TestData(
                "4\n" +
                        "1 3 3 1\n", "0"
            )
        )

    override fun callTestTarget() {
        abc197c()
    }

    @Test
    fun setはintArrayを区別するか_no() {
        val a = intArrayOf(0, 1, 0)
        val b = intArrayOf(0, 1, 0)
        val set = mutableSetOf<IntArray>()
        set.add(a)
        set.add(b)
        set.size shouldBe 2
        // IntArrayは中身のデータが同じでも区別される
    }
}