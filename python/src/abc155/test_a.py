from abc155.a_poor import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5 7 5
""", """Yes
""", main)

    def test_main2(self):
        self.helper("""4 4 4
""", """No
""", main)

    def test_main3(self):
        self.helper("""4 9 6
""", """No
""", main)

    def test_main4(self):
        self.helper("3 3 4", "Yes\n", main)
