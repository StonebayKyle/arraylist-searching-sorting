# Searching Questions

## 1
- The first search algorithm is very simple, but it often needs to check a lot of objects before reaching the answer (avg checks: total/2).
- The binary search algorithm is less simple, but that means it may be able to do less computations than the first. Starting with a sorted list makes it so the goal can be compared with any object and often make more progress towards the goal than just +1, which is more efficient.
##2
- The second algorithm is more efficient because it can check less indexes to get closer to the goal. Instead of checking equality of everything until the goal is found, the algorithm can check where the goal should be relative to some object. Using this, it can systematically reduce scope until the goal is (or isn't) found.

## 3
- Search algorithm:
    - Index 0: "apple"
        - if (equals("blueberry")) return index
    - Index 1: "banana"
        - if (equals("blueberry")) return index
    - ... Index 10: "watermelon"
        - if (equals("blueberry)) return index
    - index > length
        - return -1
    
    - This took 11 checks to fail

- Binary Search Algorithm:
    - Index length/2 (5): "lime"
        - compareTo("blueberry") > blueberry is first
    - Index current/2 (2): "banana"
        - compareTo("blueberry") > blueberry is second
    - Index current,prev avg (3): "cherry"
        - compareTo("blueberry") > blueberry is first
    - Index current,prev avg (1): "banana"
        - if (|current-prev| <= 2 and equals("blueberry")) return prev1, else -1
        - this returns -1.

    - this took 4 checks to fail

### iii
- Big O Notation:
    - n = length
- Search algorithm takes n checks to fail
    - n=1000, 1000 checks
- Binary search algorithm takes log(base2)(n) checks to fail
    - n=1000, 10 checks

# Sorting Questions

## 1
- Seletion Sort
    - Very simple. Repetitive to find max.
- Insertion Sort
    - Simple, but very repetitive. The amount of checks grows exponentially.
- Bubble Sort
    - Similar to insertion sort but does the entire list each pass instead of small parts.
    - Might be less repetitive than insertion sort

## 2
- n = 10
### 1: Best
- Selection sort: n^2: 100
- Insertion sort: n: 10
- Bubble sort: n^2: 10
### 2: Worst
- Selection sort: 100
- Insertion sort: 100
- Bubble sort: 100
### 3: Average/Random
- Selection sort: n^2: 100, 100000, 1000000
- Insertion sort: n^2: 100, 100000, 1000000
- Bubble sort: n^2: 100, 100000, 1000000

## 3
- It would be better to directly search using the basic search because O(n/2), the average checks required for basic search, is better than O(n^2+log(n)), the average checks required for a sorting algorithm + binary search.
