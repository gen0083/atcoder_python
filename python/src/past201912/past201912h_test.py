from past201912.past201912h import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4
5 3 3 5
6
1 2 1
2 2
2 2
3 100
3 1
1 1 3""", """9
""", main)

    def test_main2(self):
        self.helper("""10
241 310 105 738 405 490 158 92 68 20
20
2 252
1 4 36
2 69
1 5 406
3 252
1 3 8
1 10 10
3 11
1 4 703
3 1
2 350
3 10
2 62
2 3
2 274
1 2 1
3 126
1 4 702
3 6
2 174""", """390
""", main)

    def test_main3(self):
        self.helper("""2
3 4
3
1 2 9
2 4
3 4""", """0
""", main)
