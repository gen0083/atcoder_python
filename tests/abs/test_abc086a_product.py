from tests.si_so_test_case import SISOTestCase
from abs.abc086a_product import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("3 4", "Even\n", do_code)

    def test_second_case(self):
        self.helper("1 21", "Odd\n", do_code)
