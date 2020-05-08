from problems.arc095d import main, comb
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
6 9 4 2 11""", """11 6
""", main)

    def test_main2(self):
        self.helper("""2
100 0""", """100 0
""", main)

    def test_comb1(self):
        actual = comb(4, 2)
        self.assertEqual(actual, 6)

    def test_comb2(self):
        actual = comb(11, 6)
        self.assertEqual(actual, 462)
