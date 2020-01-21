from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_10_b_matrix_chain_multiplication import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""6
30 35
35 15
15 5
5 10
10 20
20 25
""", """15125
""", main)

    def test_main2(self):
        self.helper("""""", """""", main)

    def test_main3(self):
        self.helper("""""", """""", main)
