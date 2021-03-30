from algorithm_and_data_structure.alds1_7_c_tree_walk import main
from tests.si_so_test_case import SISOTestCase


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""9
0 1 4
1 2 3
2 -1 -1
3 -1 -1
4 5 8
5 6 7
6 -1 -1
7 -1 -1
8 -1 -1
""", """Preorder
 0 1 2 3 4 5 6 7 8
Inorder
 2 1 3 0 6 5 7 4 8
Postorder
 2 3 1 6 7 5 8 4 0
""", main)

    def test_main2(self):
        self.helper("""5
3 4 0
4 -1 -1
1 -1 -1
2 -1 -1
0 1 2
""", """Preorder
 3 4 0 1 2
Inorder
 4 3 1 0 2
Postorder
 4 1 2 0 3
""", main)

    def test_main3(self):
        self.helper("""7
0 -1 -1
1 -1 4
4 5 -1
2 3 1
3 -1 0
6 -1 -1
5 6 -1
""", """Preorder
 2 3 0 1 4 5 6
Inorder
 3 0 2 1 6 5 4
Postorder
 0 3 6 5 4 1 2
""", main)
