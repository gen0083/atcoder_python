from tests.si_so_test_case import SISOTestCase
from abc149.b_greedy_takahashi import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""2 3 3""", """0 2
""", main)

    def test_second_case(self):
        self.helper("""500000000000 500000000000 1000000000000""", """0 0
""", main)