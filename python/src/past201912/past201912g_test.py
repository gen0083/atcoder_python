from past201912.past201912g import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""6
10 10 -10 -10 -10
10 -10 -10 -10
-10 -10 -10
10 -10
-10""", """40
""", main)

    def test_main2(self):
        self.helper("""3
1 1
1""", """3
""", main)
