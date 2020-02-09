from tests.si_so_test_case import SISOTestCase
from abc154.d_dice_in_line import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5 3
1 2 2 4 5
""", """7.000000000000
""", main)

    def test_main2(self):
        self.helper("""4 1
6 6 6 6
""", """3.500000000000
""", main)

    def test_main3(self):
        self.helper("""10 4
17 13 13 12 15 20 10 13 17 11
""", """32.000000000000
""", main)
