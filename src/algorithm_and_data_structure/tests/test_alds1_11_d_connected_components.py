from tests.si_so_test_case import SISOTestCase
from algorithm_and_data_structure.alds1_11_d_connected_components import main


class Test(SISOTestCase):
    def test_main(self):
        self.helper("""10 9
0 1
0 2
3 4
5 7
5 6
6 7
6 8
7 8
8 9
3
0 1
5 9
1 3
""", """yes
yes
no
""", main)

    def test_main2(self):
        with open("alds1_11_d_case22in.txt") as i:
            with open("alds1_11_d_case22out.txt") as o:
                input_data = "".join(i.readlines())
                output_data = "".join(o.readlines())
                self.helper(input_data, output_data, main)

