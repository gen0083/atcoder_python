from algorithm_and_data_structure.alds1_3_a_stack import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("1 2 +", "3\n", do_code)

    def test_second_case(self):
        self.helper("1 2 + 3 4 - *\n", "-3\n", do_code)
