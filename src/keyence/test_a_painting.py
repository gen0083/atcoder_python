from tests.si_so_test_case import SISOTestCase
from keyence.a_painting import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3
7
10
""", """2
""", main)

    def test_main2(self):
        self.helper("""14
12
112
""", """8
""", main)

    def test_main3(self):
        self.helper("""2
100
200
""", """2
""", main)
