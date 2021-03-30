from panasonic2020.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 5""", """10
""", main)

    def test_main2(self):
        self.helper("""7 3""", """11
""", main)

    def test_main3(self):
        self.helper("""1000000000 1000000000
""", """500000000000000000
""", main)
