from tests.si_so_test_case import SISOTestCase
from abc152.b_comparing_strings import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 3
""", """3333
""", main)

    def test_main2(self):
        self.helper("""7 7
""", """7777777
""", main)
