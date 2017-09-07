# IC
Instructions Calculator
calculates a result from a set of instructions. Instructions comprise
of a keyword and a number that are separated by a space per line. Instructions are loaded
from file and results are output to the screen. Any number of Instructions can
be specified. Instructions can be any binary operators of your choice (e.g., add, divide,
subtract, multiply etc). The instructions will ignore mathematical precedence. The last
instruction should be “apply” and a number (e.g., “apply 3”). The calculator is then
initialised with that number and the previous instructions are applied to that number.
Examples of the calculator lifecycle might be:
Example 1.
[Input from file]
add 2
multiply 3
apply 4
[Output to screen]
18
[Explanation]
(4 + 2) * 3 = 18
Example 2.
[Input from file]
multiply 9
apply 5
[Output to screen]
45
[Explanation]
5 * 9 = 45
----------------------------
This is the initial release of the instructions file calculator project. The calculator assumes that:
1.	the calculator runs with instructions file name as an argument. 
2.	an instruction is formed of a keyword (add, subtract, divide, or multiply), and number ranges from -int to +int. 
3.	every line containing an instruction only (keyword space number line terminator). i.e. add 5 
4.	any spaces or tabs are considered malformed instructions 
5.	keywords are small case letters.
6.	last instruction must be the apply instruction. 
7.	a file contains one list of instructions, which must end with the apply instruction. 
8.	if the file contains more than one apply instructions, it will consider the first one as the end of instructions.
