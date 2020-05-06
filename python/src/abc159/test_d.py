from abc159.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
1 1 2 1 2
""", """2
2
3
2
3
""", main)

    def test_main2(self):
        self.helper("""4
1 2 3 4
""", """0
0
0
0
""", main)

    def test_main3(self):
        self.helper("""5
3 3 3 3 3
""", """6
6
6
6
6
""", main)

    def test_main4(self):
        self.helper("""8
1 2 1 4 2 1 4 1
""", """5
7
5
7
7
5
7
5
""", main)
