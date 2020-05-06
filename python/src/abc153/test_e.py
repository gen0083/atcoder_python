from abc153.e_crested_lbis_vs_monster import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""9 3
8 3
4 2
2 1
""", """4
""", main)

    def test_main2(self):
        self.helper("""100 6
1 1
2 3
3 9
4 27
5 81
6 243
""", """100
""", main)

    def test_main3(self):
        self.helper("""9999 10
540 7550
691 9680
700 9790
510 7150
415 5818
551 7712
587 8227
619 8671
588 8228
176 2461
""", """139815
""", main)
