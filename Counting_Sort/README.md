# Counting Sort

## Summary

Counting sort is an algorithm which sorts a list by getting the count of the occurrence of all the numbers in a list from least to greatest. then rebuild the list using these counts.

first iterating the list and finding the highest value, then making an array with the length of the highest value found and the initial values of the array is 0. Then the list is iterated again but this time every occurrence of a value in the list increments it index in the array just made. Finally iterate though the array

## Algorithm

1. iterate the list and find the highest value(k)

2. Make an array of length k+1(we add 1 because we want the array to go from 0 to k not 1 to k) with initial values equal to 0

3. Iterate the list again and with every occurrence of a value increment array[value] by 1.

4. iterate through the newly made array, get the value in each index(occur)
   - rebuild list by adding index(actual value index) to list occur times

## Example

### Step 1

### 1st iteration

list = 4 1 3 5 1 4 4

get k by going through the list and finding highest value

k = 5

### Step 2

list = 4 1 3 5 1 4 4

k = 5
array = [0,0,0,0,0,0]

### Step 3

### 1st iteration

list = 4 1 3 5 1 4 4

k = 5
array = [0,2,0,1,2,1]

### Step 4

### 1st iteration

list =  
array = [<ins>0</ins>,2,0,1,2,1]
there are 0 0's so do nothing

### 2nd iteration

list =  
array = [0,<ins>2</ins>,0,1,2,1]  
there are 2 1's so add 1 to list twice
list = 1
list = 1 1

### 3rd iteration

list = 1 1  
array = [0,2,<ins>0</ins>,1,2,1]  
there are 0 2's so do nothing

### 4th iteration

list = 1 1
array = [0,2,0,<ins>1</ins>,2,1]  
there is 1 3 so add 3 to list
list = 1 1 3

### 6th iteration

list = 1 1 3
array = [0,2,0,1,<ins>2</ins>,1]  
there are 2 4's so add 4 to list twice
list = 1 1 3 4
list = 1 1 3 4 4

### 6th iteration

list = 1 1 3
array = [0,2,0,1,2,<ins>1</ins>]  
there is 1 5 so add 5 to list
list = 1 1 3 4 4 5

rebuilt list = 1 1 3 4 4 5

## Note

Note that when k>n(length of list), this algorithm essentially ends up increasing the n of the entire algorithm. For example if the list = 0 5 1 202 then k=202 and the length of the newly made array would be 203. we would have to perform step 4 on an array of length 203. So we would want to use this algorithm is cases were k<=n.

## Time Complexity

Notice in the example steps 1 and 3 always has a O(n).

Since step two needs create an array of length k+1 then iterate it to initialize each value to 0, the big O of step two is always O(k+1).

What of step 4? Notice that in step 4 there are k+1 iterations doing something iV(index value) times. So in the example above since k=5 then the number of loops is 0+2+0+1+2+1 = 6 = n, in fact the number of loops in the fourth step will always be n. So here the big of n is also O(n).

so we have O(n) + O(n) + O(k+1) + O(n) which can be reduced to O(n) + O(k) and even further to O(n+k).

### Worst Case

Given the reason noted above its clear that as k increase the algorithm gets worst. So assuming the restriction k<=n that means that the worst case is k=n and in this circumstance the big O is O(n\*n) = O(n^2)

### Average Case

Assuming that the average case is a situation where k = n/2.
In this circumstance the big O is O(n\*n/2) => O(n^2/2) => O(n^2)

### Best Case

Given the reason noted above its clear that as k decreases the algorithm improves. So assuming the restriction k>=1 that means that the best case is k=1 and in this circumstance the big O is O(n\*1) = O(n)
