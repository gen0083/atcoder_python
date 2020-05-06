from problems.arc009b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""0 8 1 3 5 4 9 7 6 2
10
1
2
3
4
5
6
7
8
9
10""", """8
1
3
5
4
9
7
6
2
10
""", main)

    def test_main2(self):
        self.helper("""0 9 8 7 6 5 4 3 2 1
3
13467932
98738462
74392""", """74392
98738462
13467932
""", main)

    def test_main3(self):
        self.helper("""0 1 2 3 4 5 6 7 8 9
4
643
1234
43
909""", """43
643
909
1234
""", main)

    def test_main4(self):
        self.helper("""0 7 4 3 9 5 6 2 1 8
2
333
333""", """333
333
""", main)

    def test_main5(self):
        self.helper("""0 2 4 6 8 1 3 5 7 9
1
10
""", """10
""", main)
