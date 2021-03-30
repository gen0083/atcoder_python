from algorithm_and_data_structure.alds1_5_b_merge_sort import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""10
8 5 9 2 6 3 7 1 10 4
""", """1 2 3 4 5 6 7 8 9 10
34
""", main)
