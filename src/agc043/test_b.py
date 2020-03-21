from agc043.b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4
1231
""", """1
""", main)

    def test_main2(self):
        self.helper("""10
2311312312
""", """0
""", main)
