from abc148.e_double_factorial import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("12\n", "1\n", main)

    def test_second_case(self):
        self.helper("5\n", "0\n", main)

    def test_third_case(self):
        self.helper("1000000000000000000\n", "124999999999999995\n", main)
