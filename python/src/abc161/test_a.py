from abc161.a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""1 2 3
""", """3 1 2
""", main)

    def test_main2(self):
        self.helper("""100 100 100
""", """100 100 100
""", main)

    def test_main3(self):
        self.helper("""41 59 31
""", """31 41 59
""", main)
