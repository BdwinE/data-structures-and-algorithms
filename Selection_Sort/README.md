# Selection Sort

## Summary

Selection sort is an algorithm which sorts a list by
going through the list, finding the smallest value and
putting that value in front of the list more specifically
the end of the sorted part of the list(this sorted part would be at the start).

## Algorithm

1. Have a pointer at index 0 resenting the end of the sorted list

2. Starting at the pointer index iterate through the list and find the smallest value

3. Insert that element at the pointer index

4. Increment the pointer index

5. Repeat steps 2-4 until pointer index reaches the end of the list or n-1 times

## Example

### 1st iteration

list = <ins>4</ins> 25 3  
pI(for pointer index) = 0  
smallestNum = 4

list = 4 <ins>25</ins> 3  
pI = 0  
smallestNum = 4

list = 4 25 <ins>3</ins>  
pI = 0  
smallestNum = 3  
insert 3 at index 0  
list = 3 4 25  
pI = 0 + 1 = 1

### 2nd iteration

list = 3 <ins>4</ins> 25  
pI = 1  
smallestNum = 4

list = 3 4 <ins>25</ins>  
pI = 1  
smallestNum = 4  
4 is in correct pos no need to reinsert  
pI = 1 + 1 = 2

pI is at the last element in list so the iteration is
complete and the list is sorted

## Improvement

The algorithm can be improved.
The algorithm requires that you insert the lowest value at pI,
this can be easily done in languages like javascript using splice
but in languages like java you need to shift each element down one by one.
This can greatly reduce the efficiency of the algorithm so instead of inserting
value's we'll instead swap the lowest index value with pI.

## Time Complexity

Notice in the example above, within each iteration there is a repeating process(a loop) which happens n times in the first iteration and reduces by 1 loop in each subsequent iteration(excluding the very last iteration(which would only have 1 loop): n-1).
This in effect means that there are $1-1+2+3+4+5+...+n$ loops, using mathematics we can deduce that to
$1+2+3+4+5+...+n = (n(n+1))/2-1 = (n^2+n)/2-1$
and since we only care about the leading degree this mean that the big O of selection sort is O(n^2)
