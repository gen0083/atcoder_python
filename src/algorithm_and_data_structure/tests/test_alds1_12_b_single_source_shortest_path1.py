from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_12_b_single_source_shortest_path1 import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
0 3 2 3 3 1 1 2
1 2 0 2 3 4
2 3 0 3 3 1 4 1
3 4 2 1 0 1 1 4 4 3
4 2 2 1 3 3
""", """0 0
1 2
2 2
3 1
4 3
""", main)
