from abc152.c_low_elements import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
4 2 5 1 3
""", """3
""", main)

    def test_main2(self):
        self.helper("""4
4 3 2 1
""", """4
""", main)

    def test_main3(self):
        self.helper("""6
1 2 3 4 5 6
""", """1
""", main)

    def test_main4(self):
        self.helper("""8
5 7 4 2 6 8 1 3
""", """4
""", main)

    def test_main5(self):
        self.helper("""1
1
""", """1
""", main)
