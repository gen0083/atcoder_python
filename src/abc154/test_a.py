from tests.si_so_test_case import SISOTestCase
from abc154.a_remaining_balls import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""red blue
3 4
red
""", """2 4
""", main)

    def test_main2(self):
        self.helper("""red blue
5 5
blue
""", """5 4
""", main)

    def test_main3(self):
        self.helper("""""", """""", main)
