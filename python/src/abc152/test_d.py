from abc152.d_handstand2 import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("25", "17\n", main)

    def test_main2(self):
        self.helper("1", "1\n", main)

    def test_main3(self):
        self.helper("100", "108\n", main)

    def test_main4(self):
        self.helper("2020", "40812\n", main)

    def test_main5(self):
        self.helper("200000", "400000008\n", main)
