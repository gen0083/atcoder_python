from algorithm_and_data_structure.alds1_5_d_the_number_of_inversions import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
3 5 2 1 4
""", """6
""", main)

    def test_main2(self):
        self.helper("""3
3 1 2""", """2
""", main)

    def test_main3(self):
        self.helper("100000\n" + " ".join(map(str, range(1, 100001))), "0\n", main)
