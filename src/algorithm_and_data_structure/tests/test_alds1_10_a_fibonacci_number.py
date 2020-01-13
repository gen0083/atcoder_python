from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_10_a_fibonacci_number import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
""", """3
""", main)

    def test_main2(self):
        self.helper("""44
""", """1134903170
""", main)
