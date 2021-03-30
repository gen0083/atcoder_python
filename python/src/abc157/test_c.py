from abc157.c_guess_the_number import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 3
1 7
3 2
1 7""", "702\n", main)

    def test_main2(self):
        self.helper("""3 2
2 1
2 3""", "-1\n", main)

    def test_main3(self):
        self.helper("""3 1
1 0
""", "-1\n", main)

    def test_main4(self):
        self.helper("""4 2
4 0
4 0
""", "1000\n", main)

    def test_main5(self):
        self.helper("""1 1
1 0
""", "0\n", main)

    def test_main6(self):
        self.helper("""2 0
""", "10\n", main)

    def test_main7(self):
        self.helper("""1 0
""", "0\n", main)
