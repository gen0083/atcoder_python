from abc160.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5 2 4
""", """5
4
1
0
""", main)

    def test_main2(self):
        self.helper("""3 1 3
""", """3
0
""", main)

    def test_main3(self):
        self.helper("""7 3 7
""", """7
8
4
2
0
0
""", main)

    def test_main4(self):
        self.helper("""10 4 8
""", """10
12
10
8
4
1
0
0
0
""", main)
