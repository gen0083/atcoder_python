from past201912.past201912c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 18 25 20 9 13""", """18
""", main)

    def test_main2(self):
        self.helper("""95 96 97 98 99 100""", """98
""", main)

    def test_main3(self):
        self.helper("""19 92 3 35 78 1""", """35
""", main)
