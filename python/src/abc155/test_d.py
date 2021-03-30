from abc155.d_pairs import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""4 3
3 3 -4 -2
""", """-6
""", main)

    def test_main2(self):
        self.helper("""10 40
5 4 3 2 -1 0 0 0 0 0
""", """6
""", main)

    def test_main3(self):
        self.helper("""30 413
-170202098 -268409015 537203564 983211703 21608710 -443999067 -937727165 -97596546 -372334013 398994917 -972141167 798607104 -949068442 -959948616 37909651 0 886627544 -20098238 0 -948955241 0 -214720580 277222296 -18897162 834475626 0 -425610555 110117526 663621752 0
""", """448283280358331064
""", main)
