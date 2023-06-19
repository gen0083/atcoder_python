class Typical90_008KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "10\n" +
                    "attcordeer\n", "4"
            ),
            TestData(
                "41\n" +
                    "btwogablwetwoiehocghiewobadegwhoihegnldir\n", "2"
            ),
            TestData(
                "140\n" +
                    "aaaaaaaaaaaaaaaaaaaattttttttttttttttttttccccccccccccccccccccooooooooooooooooooooddddddddddddddddddddeeeeeeeeeeeeeeeeeeeerrrrrrrrrrrrrrrrrrrr\n",
                "279999993\n"
            )
        )

    override fun callTestTarget() {
        typical90_008()
    }

}