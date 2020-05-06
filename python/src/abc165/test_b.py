from abc165.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""103
""", """3
""", main)

    def test_main2(self):
        self.helper("""1000000000000000000
""", """3760
""", main)

    def test_main3(self):
        self.helper("""1333333333
""", """1706
""", main)
