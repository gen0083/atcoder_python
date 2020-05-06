from agc041.a_table_tennis_training import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""5 2 4
""", """1
""", main)

    def test_second_case(self):
        self.helper("""5 2 3""", """2
""", main)

    def test_third_case(self):
        self.helper("""6 2 5""", """3
""", main)

    def test_fourth_case(self):
        self.helper("""7 3 6""", """3
""", main)
