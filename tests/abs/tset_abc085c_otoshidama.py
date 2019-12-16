from tests.si_so_test_case import SISOTestCase
from abs.abc085c_otoshidama import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("9 45000\n", "4 0 5\n", do_code)

    def test_second_case(self):
        self.helper("20 196000\n", "-1 -1 -1\n", do_code)

    def test_third_case(self):
        self.helper("100 1234000\n", "14 27 959\n", do_code)

    def test_forth_case(self):
        self.helper("200 2000000\n", "2000 0 0\n", do_code)
