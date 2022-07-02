/*

by Codewars

Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized 
(known as Upper Camel Case, also often referred to as Pascal case).

Examples

"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

*/

function toCamelCase(str){
	
	const re = /\s*(?:-|_|$)\s*/
	let array = str.split(re);
	
	array.forEach((element, index) => {
		if(index != 0){
			element = element.charAt(0).toUpperCase() + element.slice(1);
			array[index] = element;
		}
		
	});
	//console.log(array.join(""));
	s = array.join("");
}


let s = "the-stealth_warrior";
toCamelCase(s);
console.log(s);