from tests.si_so_test_case import SISOTestCase
from abc158.b_count_balls import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""8 3 4
""", """4
""", main)

    def test_main2(self):
        self.helper("""8 0 4
""", """0
""", main)

    def test_main3(self):
        self.helper("""6 2 4
""", """2
""", main)
