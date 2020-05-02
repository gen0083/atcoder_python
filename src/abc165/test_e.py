from abc165.e import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 1
""", """2 3
""", main)

    def test_main2(self):
        self.helper("""7 3
""", """1 6
2 5
3 4
""", main)
