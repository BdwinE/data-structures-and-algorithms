# Insertion Sort

## Summary

Insertion sort is an algorithm which sorts a list by splitting it into two halves,
a sorted half and an unsorted half. Then comparing each value from the unsorted half to values in the sorted half starting with the last value(the greatest value in the sorted half). Until it's correct position is found in the sorted half.

## Algorithm

1. Keep track of the index of the end of the sorted list(SortedEnd => SE for short) which is initially 0. And the start index of the unsorted list(US for short) initially 1.

2. Traverse the sorted list starting from index SE going to 0 finding the first index with value less than US value

   - if no such value exist in the sorted list then insert US value in index 0
   - else Insert the US value in the that current sorted list index+1

3. Increment US and SE by one

4. repeat steps 2-4 until SE = list length(n for short) - 1 or n-1 times

## Example

### 1st iteration

list = 4 25 3 5  
SE= 0  
US = 1  
CS = 0  
is 4 < 25 yes so insert 25 in index CS+1

### 2nd iteration

list = 4 25 3 5  
SE= 1  
US = 2  
CS = 1  
is 25 < 3 no

list = 4 25 3 5  
SE= 1  
US = 2  
CS = 0  
is 4 < 3 no  
Since no value < 3 we insert 3 and index 0

### 3rd iteration

list = 3 4 25 5  
SE= 2  
US = 3  
CS = 2  
is 25 < 5 no

list = 3 4 25 5  
SE= 1  
US = 2  
CS = 1  
is 4 < 5 yes so insert 5 in index CS+1

Final List = 3 4 5 25

## Improvement

The algorithm can be improved.
instead of doing a traditional insertion, which will require you to shift many values in an array. we can instead opt to only shifting the necessary values. In this case we insert our value in CS+1 and then shift everything from index CS+1 to US-1(inclusive) down one

## Time Complexity

Notice in the example above, within each iteration there is a repeating process(a loop) which happens 1 times in the first iteration and increases by 1 loop in each subsequent iteration(excluding the very last iteration(which would have n loops): n-n). Note that the inner loops can stop early depending on the values of the list.
But assuming that it doesn't(Worst case) this in effect means that there are $1+2+3+4+5+...+n-n$ loops, using mathematics we can deduce that to
$1+2+3+4+5+...+n-n = (n(n+1))/2-n = (n^2+n)/2-n$
and since we only care about the leading degree this mean that the big O of selection sort is O(n^2).

SO we know the worst case is O(n^2) what of the average and best case?

### Average Case

Assuming that the sub loops stop early on each iteration only doing half the loops $1/2+2/2+3/2+4/2+5/2+...+n/2-n/2 = (1+2+3+4+5+...+n-n)/2 = ((n^2+n)/2-n)/2 = 1/4n^2-1/4n$  
O(1/4n^2-1/4n) = O(n^2) in the Average case

### Best Case

Assuming the sub loops stop early after only the first iteration then we would have $1+1+1+1+1+1+...+1(n times) = n$ So in the best case(s) the big O is n => O(n)
