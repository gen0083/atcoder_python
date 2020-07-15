from algorithm_and_data_structure.grl4b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""6 6
0 1
1 2
3 1
3 4
4 5
5 2
""", """0
3
1
4
5
2
""", main)
