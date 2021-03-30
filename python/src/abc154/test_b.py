from abc154.b_i_miss_you import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("sardine", "xxxxxxx\n", main)

    def test_main2(self):
        self.helper("xxxx", "xxxx\n", main)

    def test_main3(self):
        self.helper("""""", """""", main)
