from tests.si_so_test_case import SISOTestCase
from abc155.c_poll import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""7
beat
vet
beet
bed
vet
bet
beet
""", """beet
vet
""", main)

    def test_main2(self):
        self.helper("""8
buffalo
buffalo
buffalo
buffalo
buffalo
buffalo
buffalo
buffalo
""", """buffalo
""", main)

    def test_main3(self):
        self.helper("""7
bass
bass
kick
kick
bass
kick
kick
""", """kick
""", main)

    def test_main4(self):
        self.helper("""4
ushi
tapu
nichia
kun
""", """kun
nichia
tapu
ushi
""", main)
