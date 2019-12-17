from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_2_d_shell_sort import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("5\n5\n1\n4\n3\n2\n", "2\n4 1\n3\n1\n2\n3\n4\n5\n", do_code)
