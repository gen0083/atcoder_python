from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_6_a_counting_sort import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""7
2 5 1 3 2 3 0
""", """0 1 2 2 3 3 5
""", main)
