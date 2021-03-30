from algorithm_and_data_structure.alds1_9_b_maximum_heap import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10
4 1 3 2 16 9 10 14 8 7
""", """ 16 14 10 8 7 9 3 2 4 1
""", main)
