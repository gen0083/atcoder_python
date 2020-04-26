from abc164.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 5
""", """unsafe
""", main)

    def test_main2(self):
        self.helper("""100 2
""", """safe
""", main)

    def test_main3(self):
        self.helper("""10 10
""", """unsafe
""", main)
