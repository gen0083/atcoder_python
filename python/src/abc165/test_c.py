from abc165.c import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 4 3
1 3 3 100
1 2 2 10
2 3 2 10
""", """110
""", main)

    def test_main2(self):
        self.helper("""4 6 10
2 4 1 86568
1 4 0 90629
2 3 0 90310
3 4 1 29211
3 4 3 78537
3 4 2 8580
1 2 1 96263
1 4 2 2156
1 2 0 94325
1 4 3 94328
""", """357500
""", main)

    def test_main3(self):
        self.helper("""10 10 1
1 10 9 1
""", """1
""", main)