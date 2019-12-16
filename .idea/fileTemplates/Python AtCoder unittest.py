from tests.si_so_test_case import SISOTestCase
from ${CARET}.${name} import do_code


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("input", "expected\n", do_code)
