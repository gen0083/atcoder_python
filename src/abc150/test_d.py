from tests.si_so_test_case import SISOTestCase
from abc150.d import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 50
6 10
""", """2
""", main)

    def test_main2(self):
        self.helper("""3 100
14 22 40
""", """0
""", main)

    def test_main3(self):
        self.helper("""5 1000000000
6 6 2 6 2
""", """166666667
""", main)
