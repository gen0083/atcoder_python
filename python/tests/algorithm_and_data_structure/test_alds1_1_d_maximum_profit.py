from algorithm_and_data_structure.alds1_1_d_maximum_profit import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("6\n5\n3\n1\n3\n4\n3\n", "3\n", do_code)

    def test_second_case(self):
        self.helper("3\n4\n3\n2\n", "-1\n", do_code)

    def test_third_case(self):
        self.helper("7\n3\n2\n4\n1\n5\n3\n6\n", "5\n", do_code)
