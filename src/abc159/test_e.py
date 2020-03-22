from abc159.e import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 5 4
11100
10001
00111
""", """2
""", main)

    def test_main2(self):
        self.helper("""3 5 8
11100
10001
00111
""", """0
""", main)

    def test_main3(self):
        self.helper("""4 10 4
1110010010
1000101110
0011101001
1101000111
""", """3
""", main)
