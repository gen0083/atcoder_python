from unittest import TestCase

from tests.si_so_test_case import SISOTestCase
from abc147.d_xor_sum_4 import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("3\n1 2 3\n", "6\n", do_code)

    def test_second_case(self):
        self.helper("10\n3 1 4 1 5 9 2 6 5 3\n", "237\n", do_code)

    def test_third_case(self):
        self.helper("10\n3 14 159 2653 58979 323846 2643383 27950288 419716939 9375105820",
                    "103715602\n", do_code)
