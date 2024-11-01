# Bubble Sort

## Summary

Bubble sort is an algorithm which sorts list from least to greatest
it does so by going through the list and comparing each value to the next value
and swapping them if current value is greater than the next value.
repeating this process n-1(list length) times.
The reason the process is repeated n-1 times instead of n times is because
the n-1'th iteration of the process will already guarantee that the highest
number in the list is pushed to the end.

## Algorithm

1. start with the first value go through the list

2. compare the current value to the next value

3. if current value is greater than next value swap next value with current value

4. repeat steps 2 and 3 until current value is the last value in list

5. repeat steps 1-4 n-1(size of elements in list minus 1) times

## Example

### 1st iteration

list = 4 25 3 65 0  
is 4 > 25 => no, don't swap

list = 4 25 3 65 0  
is 25 > 3 => yes, swap 25 and 3

list = 4 3 25 65 0  
is 25 > 65 => no, don't swap

list = 4 3 25 65 0  
is 65 > 0 => yes, swap 65 and 0

### 2nd iteration

list = 4 3 25 0 65  
is 4 > 3 => yes, swap 4 and 3

list = 3 4 25 0 65  
is 4 > 25 => no, don't swap

list = 3 4 25 0 65  
is 25 > 0 => yes, swap 25 and 0

list = 3 4 0 25 65  
is 25 > 65 => no, don't swap

### 3rd iteration

list = 3 4 0 25 65  
is 3 > 4 => no, don't swap

list = 3 4 0 25 65  
is 4 > 0 => yes, swap 4 and 0

list = 3 0 4 25 65  
is 4 > 25 => no, don't swap

list = 3 0 4 25 65  
is 25 > 65 => no, don't swap

### 4th iteration

list = 3 0 4 25 65  
is 3 > 0 => yes, swap 3 and 0

list = 0 3 4 25 65  
is 3 > 4 => no, don't swap

list = 0 3 4 25 65  
is 4 > 25 => no, don't swap

list = 0 3 4 25 65  
is 25 > 65 => no, don't swap

## Improvement

The algorithm can be slightly improved.
Imagine sorting this list = 2 1 3 4 5 6 with bubble sort.
It would take five iterations to fully sort the list
but if you actually go through the algorithm you'll notice
that the list is sorted after the first iteration.
To check for this we can add a conditional statement to each iteration:
<code>
if(there were no swaps in this iteration){
list is already sorted so exit loop
}
</code>

This would also be the case if the only swap is the first to elements in the list:
<code>
if(only swap was the first and second elements){
list is already sorted so exit loop
}
</code>

## Time Complexity

Notice in the example above, within each iteration there is a repeating process(a loop) which happens n-1 times.
And if you remember there are n-1 iterations. So there are n-1 iterations doing something n-1 times,
meaning the total number of loops are $n-1*n-1 = n^2-2n+1$.
And since we only care about the leading n as n approaches infinity we can drop everything but the n^2.
meaning that the Big O of bubble sort is O(n^2).

Without using the improved algorithm the best, worst and average case is all the same O(n^2)

### Improved Algorithm Worst case:

Still O(n^2)

### Improved Algorithm Best case

Imagine the best case where the list is either already sorted or we only need to swap
the first two numbers to sort the list. In this case we would have 1 main iteration going
through the list n-1 times. So $1*n-1 = n-1$. So the big O in the best case is
O(n).

### Improved Algorithm Average case

Assuming on average it take n/2 iterations to sort any given list then
we would have $((n-1)/2)*(n-1) = (1/2)n^2-n+1$. This can be reduced to n^2 in respects to time complexity.  
So the average case would still be O(n^2)
