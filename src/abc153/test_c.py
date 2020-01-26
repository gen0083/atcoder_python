from tests.si_so_test_case import SISOTestCase
from abc153.c_fennec_vs_monster import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 1
4 1 5
""", """5
""", main)

    def test_main2(self):
        self.helper("""8 9
7 9 3 2 3 8 4 6
""", """0
""", main)

    def test_main3(self):
        self.helper("""3 0
1000000000 1000000000 1000000000
""", """3000000000
""", main)
