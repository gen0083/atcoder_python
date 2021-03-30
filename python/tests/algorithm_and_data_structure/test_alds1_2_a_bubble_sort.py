from algorithm_and_data_structure.alds1_2_a_bubble_sort import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("5\n5 3 2 4 1\n", "1 2 3 4 5\n8\n", do_code)
