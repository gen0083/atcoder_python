from algorithm_and_data_structure.alds1_1_a_insertion_sort import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("6\n5 2 4 6 1 3\n",
                    "5 2 4 6 1 3\n2 5 4 6 1 3\n2 4 5 6 1 3\n2 4 5 6 1 3\n1 2 4 5 6 3\n1 2 3 4 5 6\n",
                    do_code)
