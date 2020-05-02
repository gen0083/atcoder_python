from abc165.d import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5 7 4
""", """2
""", main)

    def test_main2(self):
        self.helper("""11 10 9
""", """9
""", main)
