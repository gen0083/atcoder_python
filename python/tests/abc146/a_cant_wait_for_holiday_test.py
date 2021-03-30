from abc146.a_cant_wait_for_holiday import do_code
from tests.si_so_test_case import SISOTestCase


class ACantWaitForHolidayTest(SISOTestCase):

    def test_input_sun(self):
        test_case = [
            ("SUN", "7\n"),
            ("SAT", "1\n")
        ]
        for data, answer in test_case:
            self.helper(data, answer, do_code)
