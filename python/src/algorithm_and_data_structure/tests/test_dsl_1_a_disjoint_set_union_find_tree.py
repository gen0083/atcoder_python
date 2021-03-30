from algorithm_and_data_structure.dsl_1_a_disjoint_set_union_find_tree import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5 12
0 1 4
0 2 3
1 1 2
1 3 4
1 1 4
1 3 2
0 1 3
1 2 4
1 3 0
0 0 4
1 0 2
1 3 0
""", """0
0
1
1
1
0
1
1
""", main)
