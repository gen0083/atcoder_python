from abs.abc086c_traveling import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""2
3 1 2
6 1 1
""", "Yes\n", main)

    def test_second_case(self):
        self.helper("""1
2 100 100
""", "No\n", main)

    def test_third_case(self):
        self.helper("""2
5 1 1
100 1 1
""", "No\n", main)
