class Typical90_012KtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
                TestData("3 3\n" +
                        "10\n" +
                        "1 2 2\n" +
                        "1 1 1\n" +
                        "2 1 1 2 2\n" +
                        "1 3 2\n" +
                        "2 1 1 2 2\n" +
                        "2 2 2 3 2\n" +
                        "1 2 3\n" +
                        "1 2 1\n" +
                        "2 1 1 2 2\n" +
                        "2 1 1 3 3\n", "No\n" +
                        "No\n" +
                        "Yes\n" +
                        "Yes\n" +
                        "No\n"),
                TestData("1 1\n" +
                        "3\n" +
                        "2 1 1 1 1\n" +
                        "1 1 1\n" +
                        "2 1 1 1 1\n", "No\n" +
                        "Yes\n"),
                TestData("5 5\n" +
                        "42\n" +
                        "2 3 4 3 4\n" +
                        "2 3 2 3 2\n" +
                        "1 4 1\n" +
                        "2 4 1 2 2\n" +
                        "1 1 2\n" +
                        "1 4 5\n" +
                        "1 3 3\n" +
                        "2 4 2 1 3\n" +
                        "1 3 5\n" +
                        "2 2 4 2 3\n" +
                        "2 2 4 2 5\n" +
                        "2 3 4 5 1\n" +
                        "2 3 1 2 2\n" +
                        "2 3 1 1 2\n" +
                        "2 2 4 5 2\n" +
                        "2 3 2 5 3\n" +
                        "1 4 3\n" +
                        "2 3 3 3 5\n" +
                        "2 3 1 3 2\n" +
                        "1 1 5\n" +
                        "2 4 4 5 3\n" +
                        "1 1 4\n" +
                        "2 1 3 2 5\n" +
                        "2 4 3 1 4\n" +
                        "2 2 3 3 3\n" +
                        "1 2 1\n" +
                        "1 2 5\n" +
                        "2 1 4 5 3\n" +
                        "2 4 4 2 5\n" +
                        "2 4 2 2 4\n" +
                        "1 2 2\n" +
                        "2 4 1 5 2\n" +
                        "1 2 4\n" +
                        "2 3 1 4 1\n" +
                        "1 4 4\n" +
                        "2 3 2 2 1\n" +
                        "2 1 1 5 2\n" +
                        "1 4 2\n" +
                        "2 4 2 3 5\n" +
                        "1 3 2\n" +
                        "1 3 4\n" +
                        "1 2 3\n", "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "No\n" +
                        "Yes\n"),
                TestData("""2 3
                    |4
                    |1 1 1
                    |1 2 3
                    |2 1 1 2 3
                    |2 1 1 1 1
                """.trimMargin(), """No
                    |Yes
                """.trimMargin())
        )

    override fun callTestTarget() {
        typical90_012()
    }

}