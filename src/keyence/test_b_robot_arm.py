from tests.si_so_test_case import SISOTestCase
from keyence.b_robot_arm import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4
2 4
4 3
9 3
100 5
""", """3
""", main)

    def test_main2(self):
        self.helper("""2
8 20
1 10
""", """1
""", main)

    def test_main3(self):
        self.helper("""5
10 1
2 1
4 1
6 1
8 1
""", """5
""", main)
