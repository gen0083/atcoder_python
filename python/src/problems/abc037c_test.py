from problems.abc037c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5 3
1 2 4 8 16""", """49
""", main)

    def test_main2(self):
        self.helper("""20 10
100000000 100000000 98667799 100000000 100000000 100000000 100000000 99986657 100000000 100000000 100000000 100000000 100000000 98995577 100000000 100000000 99999876 100000000 100000000 99999999""", """10988865195
""", main)
