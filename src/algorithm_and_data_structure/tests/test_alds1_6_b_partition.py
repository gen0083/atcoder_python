from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_6_b_partition import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""12
13 19 9 5 12 8 7 4 21 2 6 11
""", """9 5 8 7 4 2 6 [11] 21 13 19 12
""", main)
