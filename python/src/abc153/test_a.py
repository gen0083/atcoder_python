from abc153.a_servel_vs_monster import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10 4
""", """3
""", main)

    def test_main2(self):
        self.helper("""1 10000
""", """1
""", main)

    def test_main3(self):
        self.helper("""10000 1
""", """10000
""", main)
