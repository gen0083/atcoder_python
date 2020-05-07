from past201912.past201912b import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10
9
10
3
100
100
90
80
10
30
10""", """up 1
down 7
up 97
stay
down 10
down 10
down 70
up 20
down 20
""", main)
