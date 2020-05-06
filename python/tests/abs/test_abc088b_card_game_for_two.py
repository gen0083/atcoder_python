from abs.abc088b_card_game_for_two import do_code
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_first_case(self):
        self.helper("2\n3 1\n", "2\n", do_code)

    def test_second_case(self):
        self.helper("3\n2 7 4\n", "5\n", do_code)

    def test_third_case(self):
        self.helper("4\n20 18 2 18\n", "18\n", do_code)
