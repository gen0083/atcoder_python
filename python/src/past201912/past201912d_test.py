from past201912.past201912d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""6
1
5
6
3
2
6""", """6 4
""", main)

    def test_main2(self):
        self.helper("""7
5
4
3
2
7
6
1""", """Correct
""", main)
