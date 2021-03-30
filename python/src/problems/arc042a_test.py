from problems.arc042a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 3
2
3
1""", """1
3
2
""", main)

    def test_main2(self):
        self.helper("""3 3
1
1
1""", """1
2
3
""", main)

    def test_main3(self):
        self.helper("""10 10
3
1
4
1
5
9
2
6
5
3""", """3
5
6
2
9
1
4
7
8
10
""", main)
