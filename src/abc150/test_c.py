from tests.si_so_test_case import SISOTestCase
from abc150.c import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
1 3 2
3 1 2
""", """3
""", main)

    def test_main2(self):
        self.helper("""8
7 3 5 4 2 1 6 8
3 8 2 5 4 6 7 1
""", """17517
""", main)

    def test_main3(self):
        self.helper("""3
1 2 3
1 2 3""", """0
""", main)
