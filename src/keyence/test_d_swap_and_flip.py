from tests.si_so_test_case import SISOTestCase
from keyence.d_swap_and_flip import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
3 4 3
3 2 3
""", """1
""", main)

    def test_main2(self):
        self.helper("""2
2 1
1 2
""", """-1
""", main)

    def test_main3(self):
        self.helper("""4
1 2 3 4
5 6 7 8
""", """0
""", main)

    def test_main4(self):
        self.helper("""5
28 15 22 43 31
20 22 43 33 32
""", """-1
""", main)

    def test_main5(self):
        self.helper("""5
4 46 6 38 43
33 15 18 27 37
""", """3
""", main)