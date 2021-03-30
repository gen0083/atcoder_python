from agc041.b_voting_judges import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""6 1 2 2
2 1 1 3 0 2
""", """5
""", main)

    def test_second_case(self):
        self.helper("""6 1 5 2
2 1 1 3 0 2
""", """3
""", main)

    def test_third_case(self):
        self.helper("""10 4 8 5
7 2 3 6 1 6 5 4 6 5
""", """8
""", main)
