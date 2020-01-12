from tests.si_so_test_case import SISOTestCase
from abc151.b import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5 10 7
8 10 3 6
""", """8
""", main)

    def test_main2(self):
        self.helper("""4 100 60
100 100 100
""", """0
""", main)

    def test_main3(self):
        self.helper("""4 100 60
0 0 0
""", """-1
""", main)
