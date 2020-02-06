from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_12_a_minimum_spanning_tree import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
 -1 2 3 1 -1
 2 -1 -1 4 -1
 3 -1 -1 1 1
 1 4 1 -1 3
 -1 -1 1 3 -1
""", """5
""", main)

    def test_main2(self):
        self.helper("""9
 -1 1 -1 13 -1 -1 -1 -1 -1
 1 -1 1 -1 11 -1 -1 -1 -1
 -1 1 -1 -1 -1 1 -1 -1 -1
 13 -1 -1 -1 1 -1 1 -1 -1
 -1 11 -1 1 -1 1 -1 4 -1
 -1 -1 1 -1 1 -1 -1 -1 7
 -1 -1 -1 1 -1 -1 -1 1 -1
 -1 -1 -1 -1 4 -1 1 -1 1
 -1 -1 -1 -1 -1 7 -1 1 -1
""", """8
""", main)
