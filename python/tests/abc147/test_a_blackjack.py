from abc147.a_blackjack import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_do_code(self):
        self.helper("5 7 9", "win\n", do_code)