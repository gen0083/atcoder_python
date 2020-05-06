from algorithm_and_data_structure.alds1_2_b_selecting_sort import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("6\n5 6 4 2 1 3\n", "1 2 3 4 5 6\n4\n", do_code)
