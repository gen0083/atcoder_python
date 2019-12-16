from unittest import TestCase

from tests.si_so_test_case import SISOTestCase
from abc147.b_palindrome_philia import do_code


class Test(SISOTestCase):
    def test_do_code(self):
        self.helper("redcoder", "1\n", do_code)

    def test_0_case(self):
        self.helper("vvvv", "0\n", do_code)
