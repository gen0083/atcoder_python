from tests.si_so_test_case import SISOTestCase
from abs.abc081a_placing_marbles import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("101", "2\n", do_code)

    def test_second_case(self):
        self.helper("000", "0\n", do_code)
