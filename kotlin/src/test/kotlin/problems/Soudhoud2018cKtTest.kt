class Soudhoud2018cKtTest : BaseTest() {
    // 誤差が10^-6まで許容される
    override val testData: List<TestData>
        get() = listOf(
            TestData("2 3 1", "1.0000000000\n"),
            TestData("1000000000 180707 0", "0.0001807060")
        )
    
    override fun callTestTarget() {
        soundhound2018c()
    }
}