class Abc166aKtTest : BaseTest() {
    override val testData: List<TestData> = listOf(
        TestData("ABC", "ARC\n")
    )
    
    override fun callTestTarget() {
        abc166a()
    }
}