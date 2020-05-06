from agc043.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""""", """""", main)

    def test_main2(self):
        self.helper("""""", """""", main)

    def test_main3(self):
        self.helper("""""", """""", main)
