from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_3_b_queue import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("5 100\np1 150\np2 80\np3 200\np4 350\np5 20\n",
                    "p2 180\np5 400\np1 450\np3 550\np4 800\n", do_code)
