from random import seed
from random import randint

"""
Implementation of Insertion Sort
Worst-Case time Complexity of O(N**2)
@:param arr an array to be sorted
@:returns arr that has been sorted with insertion sort
"""


def insertion_sort(arr):
    for i in range(1, len(arr)):
        hole_position = i
        insert_value = arr[i]

        while hole_position > 0 and arr[hole_position-1] > insert_value:
            arr[hole_position] = arr[hole_position-1]
            hole_position = hole_position - 1

        arr[hole_position] = insert_value

    return arr


seed(1)
arr_length = 500
testArr = []
while len(testArr) < 500:
    testArr.append(randint(0, 5000))

print(testArr)
sortedArr = insertion_sort(testArr)
print(sortedArr)
