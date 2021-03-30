class Heroes4_practiceKtTest : BaseTest() {
    override val testData: List<TestData>
        get() = listOf(
            //            TestData("3\n" +
            //                "2 3\n" +
            //                "3 1\n" +
            //                "3 2\n" +
            //                "1 3\n" +
            //                "3 3\n" +
            //                "1 3\n", "Yes\n" +
            //                "Yes\n" +
            //                "No\n")
            //        TestData("5\n" +
            //            "5009\n" +
            //            "7\n" +
            //            "9876\n" +
            //            "10000\n" +
            //            "10\n", "2\n" +
            //            "5000 9\n" +
            //            "1\n" +
            //            "7 \n" +
            //            "4\n" +
            //            "800 70 6 9000 \n" +
            //            "1\n" +
            //            "10000 \n" +
            //            "1\n" +
            //            "10 \n")
            TestData("7\n" +
                "11\n" +
                "3 1 4 1 5 9 2 6 5 3 5\n" +
                "1\n" +
                "1000\n" +
                "3\n" +
                "1 1 1\n" +
                "13\n" +
                "1 2 3 4 5 6 7 8 9 10 11 12 13\n" +
                "2\n" +
                "2 1\n" +
                "6\n" +
                "1 1 1 1 1 1\n" +
                "7\n" +
                "1 1 1 1 1 1 1\n", "6 23 21\n" +
                "1 1000 0\n" +
                "2 1 2\n" +
                "6 45 46\n" +
                "2 2 1\n" +
                "3 4 2\n" +
                "4 4 3\n")
        )
    
    override fun callTestTarget() {
        heroes4_practice()
    }
}