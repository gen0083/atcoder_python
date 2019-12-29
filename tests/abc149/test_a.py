from tests.si_so_test_case import SISOTestCase
from abc149.a import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""oder atc""", """atcoder
""", main)
