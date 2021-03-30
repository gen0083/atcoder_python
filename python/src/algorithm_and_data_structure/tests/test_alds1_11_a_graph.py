from algorithm_and_data_structure.alds1_11_a_graph import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4
1 2 2 4
2 1 4
3 0
4 1 3
""", """0 1 0 1
0 0 0 1
0 0 0 0
0 0 1 0
""", main)
