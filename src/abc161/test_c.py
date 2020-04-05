from abc161.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""7 4
""", """1
""", main)

    def test_main2(self):
        self.helper("""2 6
""", """2
""", main)

    def test_main3(self):
        self.helper("""1000000000000000000 1
""", """0
""", main)
