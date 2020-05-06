from abc149.d_prediction_and_restriction import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("""5 2
8 7 6
rsrpr
""", """27
""", main)

    def test_second_case(self):
        self.helper("""7 1
100 10 1
ssssppr
""", """211
""", main)

    def test_third_case(self):
        self.helper("""30 5
325 234 123
rspsspspsrpspsppprpsprpssprpsr
""", """4996
""", main)
