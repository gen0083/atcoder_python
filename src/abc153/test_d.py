from tests.si_so_test_case import SISOTestCase
from abc153.d_caracal_vs_monster import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("2", "3\n", main)

    def test_main2(self):
        self.helper("4", "7\n", main)

    def test_main3(self):
        self.helper("1000000000000", "1099511627775\n", main)
