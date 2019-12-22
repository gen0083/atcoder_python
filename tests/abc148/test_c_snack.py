from tests.si_so_test_case import SISOTestCase
from abc148.c_snack import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("2 3\n", "6\n", main)

    def test_second_case(self):
        self.helper("123 456\n", "18696\n", main)

    def test_third_case(self):
        self.helper("100000 99999\n", "9999900000\n", main)
