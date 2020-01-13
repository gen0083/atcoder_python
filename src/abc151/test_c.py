from tests.si_so_test_case import SISOTestCase
from abc151.c_welcome_to_atcoder import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 5
1 WA
1 AC
2 WA
2 AC
2 WA
""", """2 2
""", main)

    def test_main2(self):
        self.helper("""100000 3
7777 AC
7777 AC
7777 AC
""", """1 0
""", main)

    def test_main3(self):
        self.helper("""6 0
""", """0 0
""", main)
