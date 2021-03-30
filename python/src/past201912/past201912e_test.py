from past201912.past201912e import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""6 7
1 1 2
1 2 3
1 3 4
1 1 5
1 5 6
3 1
2 6""", """NYYNYY
NNYNNN
NNNYNN
NNNNNN
NNNNNY
YNNNYN
""", main)
