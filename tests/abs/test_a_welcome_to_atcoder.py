from tests.si_so_test_case import SISOTestCase
from abs.a_welcome_to_atcoder import do_code


class Test(SISOTestCase):
    def test_do_code(self):
        self.helper("1\n2 3\ntest\n", "6 test\n", do_code)
