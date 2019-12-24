from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_5_a_exhaustive_search import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""5
1 5 7 10 21
4
2 4 17 8
""", """no
no
yes
yes
""", main)
