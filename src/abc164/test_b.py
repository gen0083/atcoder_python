from abc164.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10 9 10 10
""", """No
""", main)

    def test_main2(self):
        self.helper("""46 4 40 5
""", """Yes
""", main)
