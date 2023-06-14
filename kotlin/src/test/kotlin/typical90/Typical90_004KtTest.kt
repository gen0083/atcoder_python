class Typical90_004KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            TestData(
                "3 3\n" +
                    "1 1 1\n" +
                    "1 1 1\n" +
                    "1 1 1\n", "5 5 5\n" +
                    "5 5 5\n" +
                    "5 5 5\n"
            ),
            TestData(
                "4 4\n" +
                    "3 1 4 1\n" +
                    "5 9 2 6\n" +
                    "5 3 5 8\n" +
                    "9 7 9 3\n", "28 28 25 26\n" +
                    "39 33 40 34\n" +
                    "38 38 36 31\n" +
                    "41 41 39 43\n"
            ),
            TestData(
                "2 10\n" +
                    "31 41 59 26 53 58 97 93 23 84\n" +
                    "62 64 33 83 27 95 2 88 41 97\n", "627 629 598 648 592 660 567 653 606 662\n" +
                    "623 633 651 618 645 650 689 685 615 676\n"
            )
        )

    override fun callTestTarget() {
        typical90_004()
    }
}