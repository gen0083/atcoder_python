from tests.si_so_test_case import SISOTestCase
from abc148.a_round_one import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("3\n1\n", "2\n", main)
