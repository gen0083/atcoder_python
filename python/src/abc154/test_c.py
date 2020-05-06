from abc154.c_distinct_or_not import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
2 6 1 4 5
""", """YES
""", main)

    def test_main2(self):
        self.helper("""6
4 1 3 1 6 2
""", """NO
""", main)

    def test_main3(self):
        self.helper("""2
10000000 10000000
""", """NO
""", main)
