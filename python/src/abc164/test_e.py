from abc164.e import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 2 1
1 2 1 2
1 3 2 4
1 11
1 2
2 5
""", """2
14
""", main)

    def test_main2(self):
        self.helper("""4 4 1
1 2 1 5
1 3 4 4
2 4 2 2
3 4 1 1
3 1
3 1
5 2
6 4
""", """5
5
7
""", main)

    def test_main3(self):
        self.helper("""6 5 1
1 2 1 1
1 3 2 1
2 4 5 1
3 5 11 1
1 6 50 1
1 10000
1 3000
1 700
1 100
1 1
100 1
""", """1
9003
14606
16510
16576
""", main)

    def test_main4(self):
        self.helper("""4 6 1000000000
1 2 50 1
1 3 50 5
1 4 50 7
2 3 50 2
2 4 50 4
3 4 50 3
10 2
4 4
5 5
7 7
""", """1
3
5
""", main)

    def test_main5(self):
        self.helper("""2 1 0
1 2 1 1
1 1000000000
1 1
""", """1000000001
""", main)
