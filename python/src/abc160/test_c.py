from abc160.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""20 3
5 10 15
""", """10
""", main)

    def test_main2(self):
        self.helper("""20 3
0 5 15
""", """10
""", main)
