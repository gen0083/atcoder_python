from algorithm_and_data_structure.alds1_2_c_stable_sort import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("5\nH4 C9 S4 D2 C3\n", "D2 C3 H4 S4 C9\nStable\nD2 C3 S4 H4 C9\nNot stable\n",
                    do_code)

    def test_second_case(self):
        self.helper("9\nS4 C4 H3 H4 S5 H5 D5 D3 S3\n",
                    "H3 D3 S3 S4 C4 H4 S5 H5 D5\nStable\nH3 D3 S3 H4 C4 S4 D5 S5 H5\nNot stable\n",
                    do_code)
