from abc162.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""15
""", """60
""", main)

    def test_main2(self):
        self.helper("""1000000
""", """266666333332
""", main)
