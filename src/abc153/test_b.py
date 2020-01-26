from tests.si_so_test_case import SISOTestCase
from abc153.b_common_racoon_vs_monster import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10 3
4 5 6
""", """Yes
""", main)

    def test_main2(self):
        self.helper("""20 3
4 5 6
""", """No
""", main)

    def test_main3(self):
        self.helper("""210 5
31 41 59 26 53
""", """Yes
""", main)

    def test_main4(self):
        self.helper("""211 5
31 41 59 26 53
""", """No
""", main)
