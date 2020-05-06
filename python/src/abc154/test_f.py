from abc154.f_many_many_paths import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""1 1 2 2
""", """14
""", main)

    def test_main2(self):
        self.helper("""314 159 2653 589
""", """602215194
""", main)

    def test_main3(self):
        self.helper("""""", """""", main)
