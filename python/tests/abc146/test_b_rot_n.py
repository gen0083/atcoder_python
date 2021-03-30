from abc146.b_rot_n import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_do_code(self):
        self.helper("2\nABCXYZ\n", "CDEZAB\n", do_code)
