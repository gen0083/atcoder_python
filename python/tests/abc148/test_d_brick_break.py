from abc148.d_brick_break import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""3
2 1 2
""", "1\n", main)

    def test_second_case(self):
        self.helper("""3
2 2 2
""", "-1\n", main)

    def test_third_case(self):
        self.helper("""10
3 1 4 1 5 9 2 6 5 3
""", "7\n", main)

    def test_forth_case(self):
        self.helper("""1
1
""", "0\n", main)
