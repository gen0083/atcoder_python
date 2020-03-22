from abc159.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
""", """1.000000000000
""", main)

    def test_main2(self):
        self.helper("""999
""", """36926037.000000000000
""", main)
