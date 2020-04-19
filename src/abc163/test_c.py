from abc163.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
1 1 2 2
""", """2
2
0
0
0
""", main)

    def test_main2(self):
        self.helper("""10
1 1 1 1 1 1 1 1 1
""", """9
0
0
0
0
0
0
0
0
0
""", main)

    def test_main3(self):
        self.helper("""7
1 2 3 4 5 6
""", """1
1
1
1
1
1
0
""", main)
