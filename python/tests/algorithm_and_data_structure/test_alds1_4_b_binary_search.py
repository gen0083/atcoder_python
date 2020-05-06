from algorithm_and_data_structure.alds1_4_b_binary_search import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""5
1 2 3 4 5
3
3 4 1""", "3\n", main)

    def test_second_case(self):
        self.helper("""3
1 2 3
1
5""", "0\n", main)

    def test_third_case(self):
        self.helper("""5
1 1 2 2 3
2
1 2""", "2\n", main)
