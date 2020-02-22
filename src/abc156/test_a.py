from tests.si_so_test_case import SISOTestCase
from abc156.a_beginner import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("2 2919", "3719\n", main)

    def test_main2(self):
        self.helper("22 3051", "3051\n", main)
