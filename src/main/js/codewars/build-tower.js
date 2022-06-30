/**
 * Build Tower

Build a pyramid-shaped tower given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ", 
  "*****"
]
And a tower with 6 floors looks like this:

[
  "     *     ", 
  "    ***    ", 
  "   *****   ", 
  "  *******  ", 
  " ********* ", 
  "***********"
]
 */

function towerBuilder(nFloors) {
	arr = [];
	while(nFloors > 0){
		const floor = (2*nFloors - 1)
		//console.log(floor)
		const floor_symbols = "*".repeat(floor)
		arr.unshift(floor_symbols);
		nFloors--;
	}

	tmp = [];
	arr.forEach(element => {
		space_symbols_count = (arr[arr.length - 1].length - element.length)/2
		space_symbols = " ".repeat(space_symbols_count)
		tmp.push(space_symbols + element + space_symbols); 
	})
	return tmp;
}

console.log(towerBuilder(9));