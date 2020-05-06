from algorithm_and_data_structure.alds1_8_a_binary_search_tree1 import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""8
insert 30
insert 88
insert 12
insert 1
insert 20
insert 17
insert 25
print
""", """ 1 12 17 20 25 30 88
 30 12 1 20 17 25 88
""", main)
