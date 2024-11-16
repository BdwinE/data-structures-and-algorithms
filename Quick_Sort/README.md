# Insertion Sort

## Summary

Quick Sort is a divide and conquer algorithm which picks a pivot point and then divide the list in two based on that point, moving all items lower than the pivot value to the left of the pivot and values greater to the right. this process is repeated using the two sub list to the right and left of the pivot until the sub-list are essentially the size of 1.

## Algorithm

1. pick a value in the list to make the pivot

2. Go through the list and put values lower than the pivot below the pivot and values higher than the pivot ahead

   - one way to do this would be to
     1. have a pointer(lets call it j and it's value is startIndex-1) where values to left(inclusive) of it are less than pivot value
     2. go through the list(excluding last value) and compare the pivot value to current value
        - if current value is less than pivot value swap current value with value at index j+1 and increment j
     3. once this is done swap pivot value and the value in pointer+1

3. Create two sub list, one list being values to the left of the pivot and the other values to the right of the pivot.

4. repeat steps 1-3 using these two sub arrays until the size of the sub array <= 1

## Example

### Init call

list = <ins>4</ins> 25 3 5  
pivot = 5  
pointer = -1  
is 4 < 5 ? yes so swap 4 with list[++pointer] = 4

list = 4 <ins>25</ins> 3 5  
pivot = 5  
pointer = 0  
is 25 < 5 ? no so do nothing

list = 4 25 <ins>3</ins> 5  
pivot = 5  
pointer = 0  
is 3 < 5 ? yes so swap 3 with list[++pointer] = 25

AFTER LOOP:
list = 4 3 25 5
pointer = 1
pivot = 5
swap list[++pointer] with pivot
list = 4 3 5 25

### 1st layer recursive call(left)

sub_list = <ins>4</ins> 3  
pointer = -1  
pivot = 3  
is 4 < 3 ? no, do nothing

AFTER LOOP:
sub_list = 4 3  
pointer = -1  
pivot = 3  
swap list[++pointer] with pivot
sub_list = 3 4

### 2nd layer recursive call(left)

sub_list =
sub_list.length is less than or equal to 1 so return

### 2nd layer recursive call(right)

sub_list = 4
sub_list.length is less than or equal to 1 so return

### 1st layer recursive call(right)

sub_list = 25
sub_list.length is less than or equal to 1 so return

## Time Complexity

Notice in the example above, we start with an initial call and then that call makes 2 recursive calls. each subsequent call divides the list, assuming that it divides the list in half(average case) we would have $n+n/2+n/4+n/8+...$ until sub $n=1$ to get "until sub $n=1$" we know the general formula of a layer is $n/2^k$ with k being the layer. and since we want to know what this is when sub $n=1$ we have $n/2^k = 1$ using log rules $=> n = 2^k => k=log[2](n)$.

So to go down one path of the recursion we have $n+n/2+n/4+n/8+...+n/2$<sup>log2(n)</sup> but we don't care about just one path we care about all the paths.

Something we left out in the original formal is the two recursion call each call makes. If we include that we'll have the formula
$n+2(n/2)+4(n/4)+8(n/8)+...+$ log2(n)\*n/2<sup>log2(n)</sup> => $n+n+n+n+...$ until the kth n; and since $k = log2(n)$ this means we do n, $log2(n)$ times => $n*log2(n)$.

So we derive that the bigO of quicksort in the average case is $n*log2(n)$

### Worst case

Assuming that the list is already sorted each recursion call will make two recursion calls where it passes an empty list for one call and a list of length n-1 for the other call. and there will be n-1 recursion calls/layers since only one element is being removed from the list each time. This means we will have
$n+n-1+n-2+n-3+n-4+..+n-(n-1)$ we know this equals $(n(n+1))/2 = (n^2+n)/2$. So in the worst case O($(n^2+n)/2$) => O($n^2$)

### Best Case

Since the most optimal case is when the list is divided into 2 the average case and the best case is the same. So the bigO here is O($n*log2(n)$)
