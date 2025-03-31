# SortSearch
This program is associated with CSC 130 - Data Structures and Algorithms Analysis at CSU - Sacramento. 

It sorts a two-dimensional array (5 * 4) based on the following. 

1️⃣ The 1st column is sorted in ascending order using Bubble Sort, displayed, and then reset to its original content.

2️⃣ The 2nd column is sorted in descending order using Selection Sort, displayed, and then reset to its original content.

3️⃣ The 3rd column is sorted in ascending order using Shell Sort, displayed, and then reset to its original content.

5️⃣ The 5th row is sorted in ascending order using Insertion Sort and then displayed.

The program then prompts the user for a number and searches the sorted 5th row for that number using Binary Search. The entire column is displayed if the number is found.

Example output using the 5*4 array:

            {5, 3, 2, 16}
            
            {9, 8, 10, 17}
            
            {4, 7, 11, 18}
            
            {2, 5, 9, 12}
            
            {7, 9, 4, 10}

Bubble Sort: 

 | 2 | 5 | 9 | 12 |
 
 | 4 | 7 | 11 | 18 |
 
 | 5 | 3 | 2 | 16 |
 
 | 7 | 9 | 4 | 10 |
 
 | 9 | 8 | 10 | 17 |


Selection Sort: 

 | 7 | 9 | 4 | 10 |
 
 | 9 | 8 | 10 | 17 |
 
 | 4 | 7 | 11 | 18 |
 
 | 2 | 5 | 9 | 12 |
 
 | 5 | 3 | 2 | 16 |


Shell Sort: 

 | 5 | 3 | 2 | 16 |
 
 | 7 | 9 | 4 | 10 |
 
 | 2 | 5 | 9 | 12 |
 
 | 9 | 8 | 10 | 17 |
 
 | 4 | 7 | 11 | 18 |


Insertion Sort: 

 | 5 | 3 | 2 | 16 |
 
 | 9 | 8 | 10 | 17 |
 
 | 4 | 7 | 11 | 18 |
 
 | 2 | 5 | 9 | 12 |
 
 | 4 | 7 | 9 | 10 |


Searching for: 10

Found! In Column: [4]

| 16 |

| 17 |

| 18 |

| 12 |

| 10 |
