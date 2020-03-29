from abc160.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""1024
""", """2020
""", main)

    def test_main2(self):
        self.helper("""0
""", """0
""", main)

    def test_main3(self):
        self.helper("""1000000000
""", """2000000000
""", main)
