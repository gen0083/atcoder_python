from tests.si_so_test_case import SISOTestCase
from abc157.d_friend_suggestions import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 4 1
2 1
1 3
3 2
3 4
4 1""", """0 1 0 1
""", main)

    def test_main2(self):
        self.helper("""5 10 0
1 2
1 3
1 4
1 5
3 2
2 4
2 5
4 3
5 3
4 5
""", """0 0 0 0 0
""", main)

    def test_main3(self):
        self.helper("""10 9 3
10 1
6 7
8 2
2 5
8 4
7 3
10 9
6 4
5 8
2 6
7 5
3 1
""", """1 3 5 4 3 3 3 3 1 0
""", main)
