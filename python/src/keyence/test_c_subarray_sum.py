from keyence.c_subarray_sum import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 2 3
""", """1 2 3 4
""", main)

    def test_main2(self):
        self.helper("""5 3 100
""", """50 50 50 30 70
""", main)

    def test_main3(self):
        self.helper("""3 3 3
""", """3 3 3
""", main)
