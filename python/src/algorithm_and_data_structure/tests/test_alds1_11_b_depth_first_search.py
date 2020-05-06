from algorithm_and_data_structure.alds1_11_b_depth_first_search import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4
1 1 2
2 1 4
3 0
4 1 3
""", """1 1 8
2 2 7
3 4 5
4 3 6
""", main)

    def test_main2(self):
        self.helper("""6
1 2 2 3
2 2 3 4
3 1 5
4 1 6
5 1 6
6 0
""", """1 1 12
2 2 11
3 3 8
4 9 10
5 4 7
6 5 6
""", main)

    def test_main3(self):
        self.helper("""6
1 2 2 4
2 1 5
3 2 5 6
4 0
5 1 4
6 1 6""", """1 1 8
2 2 7
3 9 12
4 4 5
5 3 6
6 10 11
""", main)

    def test_main4(self):
        self.helper("""3
1 1 2
2 1 3
3 1 1
""", """1 1 6
2 2 5
3 3 4
""", main)
