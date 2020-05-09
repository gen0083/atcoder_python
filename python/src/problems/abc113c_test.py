from problems.abc113c import *
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""2 3
1 32
2 63
1 12""", """000001000002
000002000001
000001000001
""", main)

    def test_main2(self):
        self.helper("""2 3
2 55
2 77
2 99""", """000002000001
000002000002
000002000003
""", main)

    def test_zero_padding1(self):
        self.assertEqual(padding_str(6), "000006")

    def test_zero_padding2(self):
        self.assertEqual(padding_str(123456), "123456")

    def test_zero_padding3(self):
        self.assertEqual(padding_str(1234567), "1234567")
