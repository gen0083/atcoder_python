class Zone_dKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData("ozRnonnoe\n", "zone"),
            TestData("hellospaceRhellospace\n", ""),
            TestData("Ro", "o")
        )

    override fun callTestTarget() {
        zone_d()
    }
}