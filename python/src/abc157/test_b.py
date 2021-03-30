from abc157.b_bingo import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""84 97 66
79 89 11
61 59 7
7
89
7
87
79
24
84
30
""", "Yes\n", main)

    def test_main2(self):
        self.helper("""41 7 46
26 89 2
78 92 8
5
6
45
16
57
17
""", "No\n", main)

    def test_main3(self):
        self.helper("""60 88 34
92 41 43
65 73 48
10
60
43
88
11
48
73
65
41
92
34
""", "Yes\n", main)
