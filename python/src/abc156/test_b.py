from abc156.b_digits import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("11 2", "4\n", main)

    def test_main2(self):
        self.helper("1010101 10", "7\n", main)

    def test_main3(self):
        self.helper("314159265 3", "18\n", main)
