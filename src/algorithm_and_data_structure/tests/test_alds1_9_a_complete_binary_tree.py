from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_9_a_complete_binary_tree import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""5
7 8 1 2 3
""", """node 1: key = 7, left key = 8, right key = 1, 
node 2: key = 8, parent key = 7, left key = 2, right key = 3, 
node 3: key = 1, parent key = 7, 
node 4: key = 2, parent key = 8, 
node 5: key = 3, parent key = 8, 
""", main)
