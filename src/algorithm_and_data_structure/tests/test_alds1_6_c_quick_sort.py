from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_6_c_quick_sort import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""6
D 3
H 2
D 1
S 3
D 2
C 1
""", """Not stable
D 1
C 1
D 2
H 2
D 3
S 3
""", main)

    def test_main2(self):
        self.helper("""2
S 1
H 1
""", """Stable
S 1
H 1
""", main)
