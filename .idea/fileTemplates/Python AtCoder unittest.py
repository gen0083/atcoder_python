from tests.si_so_test_case import SISOTestCase
from ${CARET}.${name} import main


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("input", "expected\n", main)
