from abc161.e import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""11 3 2
ooxxxoxxxoo
""", """6
""", main)

    def test_main2(self):
        self.helper("""5 2 3
ooxoo
""", """1
5
""", main)

    def test_main3(self):
        self.helper("""5 1 0
ooooo
""", """
""", main)

    def test_main4(self):
        self.helper("""16 4 3
ooxxoxoxxxoxoxxo
""", """11
16
""", main)
