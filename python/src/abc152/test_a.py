from abc152.a_ac_or_wa import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""3 3
""", """Yes
""", main)

    def test_main2(self):
        self.helper("""3 2
""", """No
""", main)

    def test_main3(self):
        self.helper("""1 1
""", """Yes
""", main)
