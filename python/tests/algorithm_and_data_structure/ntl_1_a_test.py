from algorithm_and_data_structure.ntl_1_a import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""12
""", """12: 2 2 3
""", main)

    def test_main2(self):
        self.helper("""126
""", """126: 2 3 3 7
""", main)

    def test_main3(self):
        self.helper("""1000000007
""", """1000000007: 1000000007
""", main)

    def test_main4(self):
        self.helper("""17
""", """17: 17
""", main)

    def test_main5(self):
        self.helper("""2
""", """2: 2
""", main)
