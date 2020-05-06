from abs.abc081b_shift_only import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("3\n8 12 40\n", "2\n", do_code)

    def test_second_case(self):
        self.helper("4\n5 6 8 10\n", "0\n", do_code)

    def test_third_case(self):
        self.helper("6\n382253568 723152896 37802240 379425024 404894720 471526144\n", "8\n",
                    do_code)
