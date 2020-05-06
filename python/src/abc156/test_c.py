from abc156.c_rally import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2
1 4
""", "5\n", main)

    def test_main2(self):
        self.helper("""7
14 14 2 13 56 2 37
""", "2354\n", main)
