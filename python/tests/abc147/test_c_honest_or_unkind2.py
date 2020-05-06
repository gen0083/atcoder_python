from abc147.c_honest_or_unkind2 import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_do_code(self):
        self.helper("3\n1\n2 1\n1\n1 1\n1\n2 0", "2\n", do_code)

    def test_second_case(self):
        self.helper("3\n2\n2 1\n3 0\n2\n3 1\n1 0\n2\n1 1\n2 0", "0\n", do_code)

    def test_third_case(self):
        self.helper("2\n1\n2 0\n1\n1 0\n", "1\n", do_code)
