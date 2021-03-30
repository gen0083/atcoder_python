from algorithm_and_data_structure.alds1_11_c_breadth_first_search import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4
1 2 2 4
2 1 4
3 0
4 1 3
""", """1 0
2 1
3 2
4 1
""", main)
