from abc157.a_duplex_printing import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("5", "3\n", main)

    def test_main2(self):
        self.helper("2", "1\n", main)

    def test_main3(self):
        self.helper("100", "50\n", main)
