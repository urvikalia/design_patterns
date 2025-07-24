# Leet Code Problem solving Practice

As an approach , I will revise the foundational material on it and latter keep practicing for the problems on Leetcode 

# Concepts to revise 

1. Big O Notation 
2. Sorting 
3. Recursion 
4. Trees
5. Graphs 
6. Dynamic Programing 


# Big O Notation 

Fundamental language for algorithm efficency 
It helps one to predict how the algorithm performs when input side increases. 

Space complexity 
Time complexity 

Time Complexity
* O(1) - Constant time . Idealistic expectation fetching at ramdom from an array based on Index, lookup of a hashtable 
* O(logn) - Logarithmic time - its for algorithms which eliminates half of the search space with every iteration binary search
* O(n) - linear search. For algorithms in which every element has to be scanned ones traversing of arrays
* O(nlogn) - linearithmetic for algorithms with divide and conquer strategy 
* O(n^2) - Quadratic time complexity : for nested loops 
* O(2^n) - exponential time complexity where all the combinations have to be considered

Space complexity 
* O(1) - In place replacement 
* O(logn) - recursive algorithm with logarithmic depth 
* O(n) -  create a data stucture proportional to input size 
* O(n^2) - involves two dimentional matrices or adjacency matrices for graph representation

Data Structures
1. Arrays 
2. LinkedList : insertion and deletion is O(1) and search is O(n) 
3. Hashtables : search is O(1), degrades to O(n) when we have collisions
4. Binary Search : O(logn) - eliminates half of the data set 


Trade of between Space and time complexity 

Mobile application: one might want to optimize for space , but now it might not be a constraining factor as it use to be ealier 
Desktop application : optimize for time 


NlogN and N^2 change drastically when N is a large number 
example is India Population - 1.43 billion , 1.43 *10^9 

2 GHZ 4 core processor 
effective processing assuming 80% parallel utilization 
2*10^9 * 4* 0.8 ~ 6.4 *10^9 operations/ second 


# Sorting 

## Selection Sort

Concept: Find the minimum element , swap with the first position , repeat the remaining array 
Time Complexity: O(n^2)
Space complexity: O(1)
Stable: No


## Bubble Sort

Concept: Repeatedly step through the list, compare adjacent elements , swap if wrong order
Largest element bubbles to the correct position with each pass
Can optimize with early termination if no swaps occur 
Time Complexity: O(n^2) worst case, O(n) best case
Space complexity: O(1)
Stable: Yes 

## Insertion Sort 

Concept: Build sorted array one element at a time by inserting each element into correct position 
excellent for small arrays or nearly sorted array 
Used in hybrid algorithm 
Online algorithm (can sort data as arrives)

Time complexity: O(n^2) average/ worst , O(n) best
Space complexity: O(1)
Stable: Yes 


## Merge Sort

Concept: Divide the array into halves, recursively sort each half, then merge sorted half
Requires extra space for merging 
Foundation for external sorting 
Time complexity: O(nlogn) 
Space complexity: O(n)
Stable: Yes 


## Quick Sort 

Choose pivot, partition array such that 
elements < pivot are to the left 
elements > pivot are to the right 
recursively sort partition 

Time complexity: average case O(nlogn) , worst case o(n^2)
Pivotal selection crusial for performance
Space complexity: O(logn) 
Stable: No 


## Lomuto Sort 
Its optimised quick sort , with in place replacement 
so we have have pivot values as first or last 
arrange them as smaller first and then bigger, one needs to remeber where smaller ends and where bigger starts
whenever you find a value smaller than the pivot , you have to swap the end of smaller with the bigger 
at the end , swap the start value with last of smaller. 


## Hoarse Sort

again optimised Quick sort , with in place replacement 
we scan through just once 
have two pointers, smaller and bigger 
while smaller <= bigger 
    smaller = start+1
    bigger = arr.length 
    keep moving smaller 
    keep moving bigger 
    if both stuck , swap and increment smaller and decrement bigger 
swap (arr, start, bigger)
sort(arr, start, bigger-1)
sort(arr, start, bigger+1)



Java uses quick sort for primitive types and merge sort for objects 
Quick sort is in place , merge sort is not 
Quick sort is not stable , merge sort is stable 


## Heap Sort 
basically a complete binary tree stored as array 
in place : build heap 
then extract : the root [TODO]
i th node
    parent = i/2 -1
    leftchild = 2*i + 1 
    rightchild = 2*i + 2 

build heap 
    find the first non leaf node and loop through from that node to 0th node

maxheapify 
    for the Ith node 
    find left child index and right child index 
    find the largest of it 
    // remination condition 
            swap(arr, i, largestindex)
            maxheapify(arr, largestIndex)
