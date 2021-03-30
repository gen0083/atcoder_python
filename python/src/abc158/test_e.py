from abc158.e_divisible_substring import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 3
3543
""", """6
""", main)

    def test_main2(self):
        self.helper("""4 2
2020
""", """10
""", main)

    def test_main3(self):
        self.helper("""20 11
33883322005544116655
""", """68
""", main)

    def test_main4(self):
        n = "1" * 20000
        n = "20000 9\n" + n
        self.helper(n, """3
""", main)
