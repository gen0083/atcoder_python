from tests.si_so_test_case import SISOTestCase
from abc151.e_max_min_sums import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 2
1 1 3 4
""", """11
""", main)

    def test_main2(self):
        self.helper("""6 3
10 10 10 -10 -10 -10
""", """360
""", main)

    def test_main3(self):
        self.helper("""3 1
1 1 1
""", """0
""", main)

    def test_main4(self):
        self.helper("""10 6
1000000000 1000000000 1000000000 1000000000 1000000000 0 0 0 0 0
""", """999998537
""", main)
