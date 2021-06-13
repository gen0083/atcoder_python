from problems.abc205d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 3
3 5 6 7
2
5
3
""", """2
9
4
""", main)

    def test_main2(self):
        self.helper("""5 2
1 2 3 4 5
1
10
""", """6
15
""", main)
