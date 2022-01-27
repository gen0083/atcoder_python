class Paizab011Test : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("3 1", "6"),
            TestData("3 6", "1"),
            TestData("157 1518", "1309")
        )

    override fun callTestTarget() {
        paizab011()
    }
}