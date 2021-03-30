from abc162.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2
""", """9
""", main)

    def test_main2(self):
        self.helper("""200
""", """10813692
""", main)
