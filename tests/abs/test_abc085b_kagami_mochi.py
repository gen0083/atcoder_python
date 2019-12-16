from tests.si_so_test_case import SISOTestCase
from abs.abc085b_kagami_mochi import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("4\n10\n8\n8\n6\n", "3\n", do_code)

    def test_second_case(self):
        self.helper("3\n15\n15\n15\n", "1\n", do_code)

    def test_third_case(self):
        self.helper("7\n50\n30\n50\n100\n50\n80\n30\n", "4\n", do_code)
