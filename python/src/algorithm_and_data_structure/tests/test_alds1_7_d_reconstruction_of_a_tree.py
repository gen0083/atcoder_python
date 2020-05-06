from algorithm_and_data_structure.alds1_7_d_reconstruction_of_a_tree import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
1 2 3 4 5
3 2 4 1 5
""", """3 4 2 5 1
""", main)

    def test_main2(self):
        self.helper("""4
1 2 3 4
1 2 3 4
""", """4 3 2 1
""", main)
