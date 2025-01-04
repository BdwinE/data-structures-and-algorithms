# Radix Sort

## Summary

Radix Sort is a sorting algorithm that sorts natural numbers starting with the least significant digit to the most significant digit. It does this in two parts, using an array of the numbers and something called a bucket(s). Think of buckets as literal buckets used to separate the numbers depending on their digits. So all the 1's go in the 1 bucket the 5s in the 5 bucket and so on. After the numbers are put in their respective buckets the are put back in the original array in a stable way(explained later).

## Algorithm

1. create a 2d array with a size of 10 to use as the buckets

2. iterate the list and find the max value(how many digits this maxValue has[lets call it mVDigits] will determine the number of iterations we'll have to make to sort the list)

3. Go through the list mVDigits time,
   a. starting with the least significant digit(to to the most significant as the iteration increases) of each value in the list, add this value to it's corresponding bucket index, i.e. 2 goes in the second bucket.
   b. once step a is done, starting with bucket 0 readd the items in the buckets to the list(re-adding the top most values in the bucket first)

## Example

list = 4 25 3 24 31
mVDigits = 2(31 has 2 digits)
buckets = [[],[],[],[],[],[],[],[],[],[]]

### 1st iteration

list = 25 3 24 31
buckets = [[],[],[],[],[4],[],[],[],[],[]]

list = 3 24 31
buckets = [[],[],[],[],[4],[25],[],[],[],[]]

list = 24 31
buckets = [[],[],[],[3],[4],[25],[],[],[],[]]

list = 31
buckets = [[],[],[],[3],[4, 24],[25],[],[],[],[]]

list =
buckets = [[],[31],[],[3],[4, 24],[25],[],[],[],[]]

list = 31
buckets = [[],[],[],[3],[4, 24],[25],[],[],[],[]]

list = 31 3
buckets = [[],[],[],[],[4, 24],[25],[],[],[],[]]

list = 31 3 4
buckets = [[],[],[],[],[24],[25],[],[],[],[]]

list = 31 3 4 24
buckets = [[],[],[],[],[],[25],[],[],[],[]]

list = 31 3 4 24 25
buckets = [[],[],[],[],[],[],[],[],[],[]]

### 2nd iteration

list = 3 4 24 25
buckets = [[],[],[],[31],[],[],[],[],[],[]]

list = 4 24 25
buckets = [[3],[],[],[31],[],[],[],[],[],[]]

list = 24 25
buckets = [[3, 4],[],[],[31],[],[],[],[],[],[]]

list = 25
buckets = [[3, 4],[],[24],[31],[],[],[],[],[],[]]

list =
buckets = [[3, 4],[],[24, 25],[31],[],[],[],[],[],[]]

list = 3
buckets = [[4],[],[24, 25],[31],[],[],[],[],[],[]]

list = 3 4
buckets = [[],[],[24, 25],[31],[],[],[],[],[],[]]

list = 3 4 24
buckets = [[],[],[25],[31],[],[],[],[],[],[]]

list = 3 4 24 25
buckets = [[],[],[],[31],[],[],[],[],[],[]]

list = 3 4 24 25 31
buckets = [[],[],[],[],[],[],[],[],[],[]]

## Sable Sorting

Radix sort has to be done in a stable way. this means that elements in a bucket have to maintain the order there were in the list. Imagine you have a list with the numbers 12 24 2 3 34 1 54, the numbers 24, 34 and 54 would be in the same bucket in that order and after adding it back to the list we would add it back in that order: 24, 34, 54.

Now imagine we added these numbers to the bucket starting with the last number in the list. then we would have 54, 34, 24 appearing in a bucket in that order. If we re-added these numbers to the list in the same order as in the last example then the would appear in a different order than the originally were. This would result in an incorrectly sorted list.

## Time Complexity

Notice how many iterations we have is determined by how many digits the max value has(mVDigits) in terms of time complexity lets call this value k.

Notice in the example above in an iteration we first have to go through the list and add the values to the buckets, the time complexity of this is O(n), we then go through the 10 buckets and add each value in the bucket back to the list, so we have 10 iterations doing something m times. Where m is a value in the set {0,n}, the time complexity of this would essentially be O(n).

So we have k(n + n) + n(this n is the time complexity of finding mVDigit) = k(2n) + n = 2n*k+n
Which means the time complexity of radix sort is O(n*k)

### Worst Case

Since n is a constant we know that won't change but k can, so what happens as k increase? as k increase the number of operations also increases meaning that the worst case occurs in circumstances were k is large.
Although k can be larger than n, lets say the worst case occurs when k>=n because in this instance it's time complexity would be O(n\*n) = O(n^2) which is no better than most other sorting algorithms

### Average Case

Radix Sort doesn't really have an average case, since k is dependent on the specific dataset.

### Best Case

The best case is situations where k=1, since that's the lowest amount of digits a number can have. So we have the best case when we're dealing with a list with only single digits and in this case the time complexity would be O(n\*1) = O(n)
