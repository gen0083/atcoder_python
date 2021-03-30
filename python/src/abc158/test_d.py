from abc158.d_string_formation import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""a
4
2 1 p
1
2 2 c
1
""", """cpa
""", main)

    def test_main2(self):
        self.helper("""a
6
2 2 a
2 1 b
1
2 2 c
1
1
""", """aabc
""", main)

    def test_main3(self):
        self.helper("""y
1
2 1 x
""", """xy
""", main)
