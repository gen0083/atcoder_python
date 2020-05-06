from abc161.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""15
""", """23
""", main)

    def test_main2(self):
        self.helper("""1
""", """1
""", main)

    def test_main3(self):
        self.helper("""13
""", """21
""", main)

    def test_main4(self):
        self.helper("""100000
""", """3234566667
""", main)
