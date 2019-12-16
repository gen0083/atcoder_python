from tests.si_so_test_case import SISOTestCase
from abs.abc087b_coins import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("2\n2\n2\n100\n", "2\n", do_code)

    def test_second_case(self):
        self.helper("5\n1\n0\n150\n", "0\n", do_code)

    def test_third_case(self):
        self.helper("30\n40\n50\n6000\n", "213\n", do_code)
