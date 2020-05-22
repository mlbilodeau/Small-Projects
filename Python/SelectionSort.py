from random import seed
from random import randint

"""
Implementation of Selection Sort
Worst-Case time Complexity of O(N**2)
@:param arr an array to be sorted
@:returns arr that has been sorted with selection sort
"""


def selection_sort(arr):

    for i in range(0, len(arr)-1):
        min_index = i
        # try to find an element that is smaller than the first element (of the unsorted part of the array).
        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j

        # if we found that the first element isn't the smallest swap arr[min_index] and arr[i]
        if min_index != i:
            temp = arr[min_index]
            arr[min_index] = arr[i]
            arr[i] = temp

    return arr


# true test of speed
seed(1)
arr_length = 500
testArr = []
while len(testArr) < 500:
    testArr.append(randint(0, 5000))

print(testArr)
sortedArr = selection_sort(testArr)
print(sortedArr)
