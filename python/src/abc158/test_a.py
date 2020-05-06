from abc158.a_station_and_bus import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""ABA""", """Yes
""", main)

    def test_main2(self):
        self.helper("""BBA""", """Yes
""", main)

    def test_main3(self):
        self.helper("""BBB
""", """No
""", main)
