from tests.si_so_test_case import SISOTestCase
from abs.abc049c_daydream import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("erasedream", "YES\n", main)

    def test_second_case(self):
        self.helper("dreameraser", "YES\n", main)

    def test_third_case(self):
        self.helper("dreamerer", "NO\n", main)
