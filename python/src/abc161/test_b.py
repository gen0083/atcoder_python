from abc161.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 1
5 4 2 1
""", """Yes
""", main)

    def test_main2(self):
        self.helper("""3 2
380 19 1""", """No
""", main)

    def test_main3(self):
        self.helper("""12 3
4 56 78 901 2 345 67 890 123 45 6 789
""", """Yes
""", main)
