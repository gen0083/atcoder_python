from abc163.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""41 2
5 6
""", """30
""", main)

    def test_main2(self):
        self.helper("""10 2
5 6
""", """-1
""", main)

    def test_main3(self):
        self.helper("""11 2
5 6
""", """0
""", main)

    def test_main4(self):
        self.helper("""314 15
9 26 5 35 8 9 79 3 23 8 46 2 6 43 3
""", """9
""", main)
