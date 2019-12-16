from tests.si_so_test_case import SISOTestCase
from abs.abc083b_some_sums import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("20 2 5\n", "84\n", do_code)
